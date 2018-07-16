package com.zku.xunwu.service.impl;

import com.zku.xunwu.entity.UserEntity;
import com.zku.xunwu.repositorys.IUserRepository;
import com.zku.xunwu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    IUserRepository iUserRepository;

    @Override
    public UserEntity queryByUsername(String username) {
        return iUserRepository.findByName(username);
    }
}
