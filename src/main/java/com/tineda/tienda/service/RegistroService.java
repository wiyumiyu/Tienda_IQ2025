/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tineda.tienda.service;

import com.tineda.tienda.domain.Usuario;
 import jakarta.mail.MessagingException;
 import org.springframework.ui.Model;
 import org.springframework.web.multipart.MultipartFile;
 
 public interface RegistroService {
 
     public Model activar(Model model, String usuario, String clave);
 
     public Model crearUsuario(Model model, Usuario usuario) throws MessagingException;
     
     public void activar(Usuario usuario, MultipartFile imagenFile);
     
     public Model recordarUsuario(Model model, Usuario usuario) throws MessagingException;
 }