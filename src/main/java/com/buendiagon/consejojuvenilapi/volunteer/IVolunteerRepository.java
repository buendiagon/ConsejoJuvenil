package com.buendiagon.consejojuvenilapi.volunteer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVolunteerRepository extends JpaRepository<Volunteer, Long> {
    @Query("SELECT v from Volunteer v")
    List<Volunteer> findAll();
}
