package com.buendiagon.consejojuvenilapi.volunteer;

import com.buendiagon.consejojuvenilapi.user.IUserRepository;
import com.buendiagon.consejojuvenilapi.user.User;
import com.buendiagon.consejojuvenilapi.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerService implements IVolunteerService{

    private IVolunteerRepository volunteerRepository;

    private IUserRepository userRepository;

    @Override
    public List<Volunteer> findAll() {
        return this.volunteerRepository.findAll();
    }

    @Override
    public Volunteer insertVolunteer(Volunteer volunteer) {
        this.userRepository.save(volunteer.getUser());
        volunteer.setIdUser(volunteer.getUser().getId());
        return this.volunteerRepository.save(volunteer);
    }


    @Autowired
    public void setVolunteerRepository(IVolunteerRepository volunteerRepository){
        this.volunteerRepository = volunteerRepository;
    }

    @Autowired
    public void setUserRepository(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
