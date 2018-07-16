package com.zku.xunwu.security;

import com.zku.xunwu.entity.UserEntity;
import com.zku.xunwu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class AdminUserDetailsService implements UserDetailsService {


    @Autowired IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserEntity userEntity = userService.queryByUsername(userName);
        return new User(userName,userEntity.getPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList("ADMIN"));
    }
}
