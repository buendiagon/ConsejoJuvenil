package com.buendiagon.consejojuvenilapi.volunteer;

import com.buendiagon.consejojuvenilapi.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/volunteer")
public class VolunteerController {

    private IVolunteerService volunteerService;

    @GetMapping("/all")
    public ResponseEntity<List<VolunteerDTO>> findAllVolunteer() {
        List<Volunteer> volunteerList = this.volunteerService.findAll();
        if(volunteerList == null || volunteerList.isEmpty()) {
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(volunteerList.stream().map(VolunteerMapper.INSTANCE::toVolunteerDTO).collect(Collectors.toList()), HttpStatus.OK);
    }

    @GetMapping("User/all")
    public ResponseEntity<List<VolunteerUserDTO>> findAllVolunteerUser() {
        List<Volunteer> volunteerList = this.volunteerService.findAll();
        if(volunteerList == null || volunteerList.isEmpty()) {
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(volunteerList.stream().map(VolunteerMapper.INSTANCE::toVolunteerUserDTO).collect(Collectors.toList()), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<VolunteerUserDTO> createVolunteer(@Valid @RequestBody VolunteerUserDTO volunteerUserDTO) {
        Volunteer volunteer = this.volunteerService.insertVolunteer(VolunteerMapper.INSTANCE.toVolunteer(volunteerUserDTO));
        volunteer.getUser().setId(null);
        volunteer.setId(null);
        //Change this
        return new ResponseEntity<>(VolunteerMapper.INSTANCE.toVolunteerUserDTO(volunteer), HttpStatus.CREATED);
    }


    @Autowired
    public void setVolunteerService(IVolunteerService volunteerService) {
        this.volunteerService = volunteerService;
    }

}
