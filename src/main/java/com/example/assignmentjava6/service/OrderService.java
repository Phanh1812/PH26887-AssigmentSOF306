package com.example.assignmentjava6.service;

import com.example.assignmentjava6.entity.Order;
import com.fasterxml.jackson.databind.JsonNode;

public interface OrderService {
    Order create(JsonNode orderData);

    Object findById(Long id);
}
