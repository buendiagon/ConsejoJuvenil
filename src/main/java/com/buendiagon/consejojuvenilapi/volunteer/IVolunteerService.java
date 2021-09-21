package com.buendiagon.consejojuvenilapi.volunteer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IVolunteerService {

//    CRUD VOLUNTEER

    List<Volunteer> findAll();

    Volunteer insertVolunteer(Volunteer volunteer);

//    Volunteer findById(Long aId);
//
//    Volunteer createVolunteer(Volunteer aVolunteer);
//
//    Volunteer updateVolunteer(Volunteer aVolunteer);
//
//    void deleteVolunteer(Long aId);

}
