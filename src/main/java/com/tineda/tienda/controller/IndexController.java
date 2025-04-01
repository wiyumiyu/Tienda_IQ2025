package com.tineda.tienda.controller;

import org.springframework.stereotype.Controller;
import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mariana
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model, HttpSession session) {
        //model.addAttribute("attribute", "value");
        Long idUsuario  = (Long)session.getAttribute("idUsuario");
        return "index";
    }
    
//    @RequestMapping("/informacion")
//    public String contacto(Model model) {
//        return "contacto";
//    }    
}
