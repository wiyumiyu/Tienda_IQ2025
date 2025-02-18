z/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.tineda.tienda.service;

import com.tineda.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    List<Categoria> getCategorias(boolean activos);
}
