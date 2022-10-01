/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.pojo;

import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author AIRAM
 */

@Data
@Entity
@Table(name="cliente")
public class Cliente {
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private int idcliente;
    private String nombre;
    private String usuario;
    private String password;   
    private String email;
    
    
}
