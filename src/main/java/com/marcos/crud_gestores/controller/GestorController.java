package com.marcos.crud_gestores.controller;

import com.marcos.crud_gestores.model.Gestor;
import com.marcos.crud_gestores.service.GestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/gestores")
public class GestorController {

    @Autowired
    private GestorService service;

    // LISTAR
    @GetMapping
    public List<Gestor> listar() {
        return service.listar();
    }

    // CRIAR
    @PostMapping
    public Gestor criar(@RequestBody Gestor gestor) {
        return service.salvar(gestor);
    }

    // DELETAR
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
    @PutMapping("/{id}")
    public Gestor atualizar(@PathVariable Long id, @RequestBody Gestor gestor) {
        return service.atualizar(id, gestor);
    }
}