/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bidding.system.frontend.bidding_frontend.controller;

import ch.qos.logback.core.model.Model;
import com.bidding.system.frontend.bidding_frontend.models.UserRequestDTO;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Aluno
 */
@Controller
public class UsuarioController {
    @GetMapping("/login")
public String getLogin(Model model){
    return "login";
}
    @PostMapping("/login")
public String logar(UserRequestDTO dto, HttpSession session) {
 try {
    return "redirect:/editais";

 } catch (Exception e) {
return "login?error=true";
}
}   
}
