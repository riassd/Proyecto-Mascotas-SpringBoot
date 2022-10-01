package com.co;

import com.co.dao.ClienteDAO;
import com.co.pojo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//anotaciones ordenes
@Controller

public class ControladorInicio {

    @Autowired
    private ClienteDAO clienteDao;

    @GetMapping("/")
    public String inicio() {
        return "index";
    }
    //controlar inicio de sesión

    @GetMapping("/login")
    public String iniciosesion() {

        return "iniciosesion";
    }

    @GetMapping("/loginadmin")
    public String loginadmin(Model model) {
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        return "loginadmin";
    }

    @GetMapping("/registrar")
    public String registrar() {

        return "registrar";
    }

    @PostMapping("/guardar")
    public String guardar(Cliente clientes) {
        clienteDao.save(clientes);
        return "redirect:/loginadmin";
    }

}
