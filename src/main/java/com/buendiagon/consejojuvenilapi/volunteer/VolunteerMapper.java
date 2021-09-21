package com.buendiagon.consejojuvenilapi.volunteer;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VolunteerMapper {
    VolunteerMapper INSTANCE = Mappers.getMapper(VolunteerMapper.class);

    // DTO's to Entitys
    @Mapping(target = "ocupation", source = "ocupation")
    @Mapping(target = "placeResidence", source = "placeResidence")
    @Mapping(target = "user.name", source = "name")
    @Mapping(target = "user.lastName", source = "lastName")
    @Mapping(target = "user.email", source = "email")
    @Mapping(target = "user.username", source = "username")
    @Mapping(target = "user.password", source = "password")
    @Mapping(target = "user.idGender", source = "idGender")
    Volunteer toVolunteer(VolunteerUserDTO aVolunteerUserDto);

    // Entitys to DTO's
    @InheritInverseConfiguration
    @Mapping(target = "id", source = "id")
    @Mapping(target = "ocupation", source = "ocupation")
    @Mapping(target = "placeResidence", source = "placeResidence")
    @Mapping(target = "idUser", source = "idUser")
    VolunteerDTO toVolunteerDTO(Volunteer aVolunteer);

    @InheritInverseConfiguration
    @Mapping(target = "id", source = "id")
    @Mapping(target = "ocupation", source = "ocupation")
    @Mapping(target = "placeResidence", source = "placeResidence")
    @Mapping(target = "idUser", source = "idUser")
    @Mapping(target = "name", source = "user.name")
    @Mapping(target = "lastName", source = "user.lastName")
    @Mapping(target = "username", source = "user.username")
    @Mapping(target = "email", source = "user.email")
    @Mapping(target = "gender", source = "user.gender.gender")
    VolunteerUserDTO toVolunteerUserDTO(Volunteer aVolunteer);
}
