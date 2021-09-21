package com.buendiagon.consejojuvenilapi.volunteer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class VolunteerDTO implements Serializable {

    private static final long serialVersionUID = -1322294842640198183L;

    private Long id;

    @NotNull
    private String ocupation;

    @NotNull
    private String placeResidence;

    private Long idUser;

}
