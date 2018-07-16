package com.zku.xunwu.service;

import com.zku.xunwu.entity.UserEntity;

public interface IUserService {

    public UserEntity queryByUsername(String username);
}
