/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.intefaces;

import com.mycompany.modelos.Usuario;

/**
 *
 * @author nbmmll nnnnn
 */
public interface DAOVerificacion {
    public Usuario verificar(String nombreUsuario, int contraseniaUsuario) throws Exception;
}
