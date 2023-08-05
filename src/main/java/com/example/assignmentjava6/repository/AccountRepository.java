package com.example.assignmentjava6.repository;

import com.example.assignmentjava6.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String> {
}
