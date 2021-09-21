package com.buendiagon.consejojuvenilapi.volunteer;

import com.buendiagon.consejojuvenilapi.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "volunteer", schema = "consejo")
public class Volunteer implements Serializable {
    private static final long serialVersionUID = 2084950300939740902L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_volunteer", nullable = false)
    private Long id;

    @Column(name = "ocupation")
    private String ocupation;

    @Column(name = "place_residence")
    private String placeResidence;

    @Column(name = "id_user")
    private Long idUser;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User user;


}
