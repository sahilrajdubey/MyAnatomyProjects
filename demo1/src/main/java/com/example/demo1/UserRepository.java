package com.example.demo1;

import org.springframework.data.repository.CrudRepository; 

public interface UserRepository extends CrudRepository<User, Integer> {
    
}
