package com.buendiagon.consejojuvenilapi.gender;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "gender", schema = "consejo")
public class Gender implements Serializable {
    private static final long serialVersionUID = -1317281848728938602L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_gender", nullable = false)
    private Long id;

    @Column(name = "gender")
    private String gender;

}
