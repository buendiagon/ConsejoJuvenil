package com.buendiagon.consejojuvenilapi.user;

import org.springframework.stereotype.Service;

@Service
public interface IUserService {

    User insertUser(User user);

}
