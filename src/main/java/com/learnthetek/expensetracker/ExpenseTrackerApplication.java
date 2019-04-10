package com.learnthetek.expensetracker;

import com.learnthetek.expensetracker.services.ExpenseService;
import com.learnthetek.expensetracker.services.impl.ExpenseServiceImpl;
import org.mapstruct.util.Experimental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.learnthetek.expensetracker"})
@EnableJpaRepositories("com.learnthetek.expensetracker.repo")
@EntityScan("com.learnthetek.expensetracker.dao")
public class ExpenseTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpenseTrackerApplication.class, args);
    }



}
