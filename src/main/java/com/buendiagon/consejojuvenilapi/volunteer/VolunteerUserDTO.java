package com.buendiagon.consejojuvenilapi.volunteer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class VolunteerUserDTO extends VolunteerDTO implements Serializable {

    private static final long serialVersionUID = 8918605529297538724L;

    private String name;

    private String lastName;

    private String username;

    private String password;

    private String email;

    private Long idGender;

    private String gender;
}
