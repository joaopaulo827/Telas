/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bidding.system.frontend.bidding_frontend.service;
import com.bidding.system.frontend.bidding_frontend.controller.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aluno
 */
@Service

public class ApiService {
    private final String BASE_URL = "http://localhost:9000";
   @Autowired
    private RestTemplate restTemplate;
    
}
