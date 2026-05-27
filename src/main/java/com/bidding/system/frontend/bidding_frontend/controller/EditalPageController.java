/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bidding.system.frontend.bidding_frontend.controller;

import com.bidding.system.frontend.bidding_frontend.models.EditalDTO;
import com.bidding.system.frontend.bidding_frontend.service.AuthRestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Aluno
 */
@Controller
public class EditalPageController {
    @Autowired
    public AuthRestClientService authservice;
    @GetMapping("/editais")
    public String editar(
            Model model
    ){
        EditalDTO newEdital= new EditalDTO();
        model.addAttribute("edital", newEdital);
        return "editais";
    }    
}
