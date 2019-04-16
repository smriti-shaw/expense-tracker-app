package com.learnthetek.expensetracker.repo;

import com.learnthetek.expensetracker.dao.UserDetails;
import org.springframework.data.repository.CrudRepository;

public interface UserDetailsRepo extends CrudRepository<UserDetails, Integer> {

}
