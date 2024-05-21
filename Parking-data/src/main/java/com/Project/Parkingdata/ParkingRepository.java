package com.Project.Parkingdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.util.Optional;

@Repository
public interface ParkingRepository extends JpaRepository<Parkingdata,Integer> {
    Optional<Parkingdata> findByVname(String vname);

    Optional<Parkingdata> findByetime(LocalTime etime);

    Optional<Parkingdata> findByltime(LocalTime ltime);

    Optional<Parkingdata> findBydname(String dname);
}
