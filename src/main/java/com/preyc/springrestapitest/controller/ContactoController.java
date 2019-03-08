/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.preyc.springrestapitest.controller;

import com.preyc.springrestapitest.dao.ContactoDAO;
import com.preyc.springrestapitest.ent.Contacto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author prc
 */

@RestController
public class ContactoController {
    
    @Autowired
    private ContactoDAO contactoDAO;
    
    @GetMapping("/contactos")
    public ResponseEntity<List<Contacto>> getAllContactos(){
        List<Contacto> contactos = contactoDAO.getAllContactos();
        return ResponseEntity.ok().body(contactos);
    }
    
    
}
