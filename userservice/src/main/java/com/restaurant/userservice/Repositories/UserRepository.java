package com.restaurant.userservice.Repositories;


import com.restaurant.userservice.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}