package com.zku.xunwu.repositorys;

import com.zku.xunwu.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Integer> {

     UserEntity findByName(String name);
}
