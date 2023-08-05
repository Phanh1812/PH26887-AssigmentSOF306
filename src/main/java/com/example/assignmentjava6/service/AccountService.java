package com.example.assignmentjava6.service;

import com.example.assignmentjava6.entity.Account;
import org.springframework.stereotype.Service;

public interface AccountService {

    Account findById(String username);
}
