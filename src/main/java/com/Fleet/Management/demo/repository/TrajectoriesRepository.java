package com.Fleet.Management.demo.repository;

import com.Fleet.Management.demo.model.Trajectories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;




public interface TrajectoriesRepository extends PagingAndSortingRepository<Trajectories, Long> {

    @Query(value = "SELECT * FROM trajectories t WHERE t.taxi_id = :taxi_id AND TO_CHAR(t.date, 'YYYY-MM-DD') = :date", nativeQuery = true)
    Page<Trajectories> findByTaxiIdAndDate(@Param("taxi_id") int taxi_id, @Param("date") String date, Pageable pageable);

    @Query(value = "SELECT id, taxi_id, date, latitude, longitude FROM (SELECT id, taxi_id, date, longitude, latitude, ROW_NUMBER() OVER (PARTITION BY taxi_id ORDER BY date DESC) AS rn FROM trajectories) AS subquery WHERE rn = 1", nativeQuery = true)
    Page<Trajectories> findLastLocation(Pageable pageable);


}

