package com.zku.xunwu.repositorys;

import com.zku.xunwu.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<UserEntity,Integer> {

     UserEntity findByName(String name);
}
