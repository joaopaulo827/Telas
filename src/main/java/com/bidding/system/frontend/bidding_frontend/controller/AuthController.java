/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bidding.system.frontend.bidding_frontend.controller;



import com.bidding.system.frontend.bidding_frontend.models.UserDTO;
import com.bidding.system.frontend.bidding_frontend.models.UserRequestDTO;
import com.bidding.system.frontend.bidding_frontend.service.AuthRestClientService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Aluno
 */
@Controller
public class AuthController {
    @Autowired
    public AuthRestClientService authservice;
    
    @GetMapping("/")
    public String home(
    HttpSession session
    ){
        return "index";
    }
    
    @GetMapping("/login")
    public String login(
            Model model
    ){
        UserRequestDTO credenciais = new UserRequestDTO();
        model.addAttribute("credenciais", credenciais);
        return "login";
    }
    
    @PostMapping("/logar")
    public String logar(
            @ModelAttribute UserRequestDTO credenciais,
            HttpSession session){
        String token = authservice.logar(credenciais);
        System.out.println("token: "+token);
        session.setAttribute("token", token);
        return "redirect:/";
    }
    
    @GetMapping("/registrar")
    public String registrar(
            Model model
    ){
        UserDTO newUser = new UserDTO();
        model.addAttribute("user", newUser);
        return "registrar";
    }
    
        @PostMapping("/registrar")
    public String mandarRegistro(
            @ModelAttribute UserDTO user
    ) {
        authservice.registrar(user);
        return "redirect:/login";
    }
}
