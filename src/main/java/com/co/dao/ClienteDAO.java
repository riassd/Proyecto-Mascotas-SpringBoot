/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.dao;

import com.co.pojo.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDAO extends CrudRepository<Cliente,Integer> {
    
    
}
