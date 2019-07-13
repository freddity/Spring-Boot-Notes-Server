package com.example.knowhowtopost.repository;

import com.example.knowhowtopost.user.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findUserEntityByLogin(String login);

}