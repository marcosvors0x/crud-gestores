package com.marcos.crud_gestores.controller;

import com.marcos.crud_gestores.model.Gestor;
import com.marcos.crud_gestores.service.GestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GestorWebController {

    @Autowired
    private GestorService service;

    @GetMapping("/gestores")
    public String listar(Model model) {
        model.addAttribute("gestores", service.listar());
        return "gestores";
    }

    @PostMapping("/gestores")
    public String salvar(Gestor gestor) {
        service.salvar(gestor);
        return "redirect:/gestores";
    }

    @GetMapping("/gestores/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        service.deletar(id);
        return "redirect:/gestores";
    }
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Gestor gestor = service.buscarPorId(id);

        if (gestor == null) {
        return "redirect:/gestores";
        }

        model.addAttribute("gestor", gestor);
        return "editar";
    }
    @PostMapping("/gestores/atualizar/{id}")
    public String atualizar(@PathVariable Long id, Gestor gestor) {
        System.out.println("Tentando atualizar ID: " + id);
        System.out.println("Nome recebido: " + gestor.getNome());
        System.out.println("Email recebido: " + gestor.getEmail());

        Gestor existente = service.buscarPorId(id);

        if (existente == null) {
            System.out.println("Gestor não encontrado no banco");
            return "redirect:/gestores";
    }

    service.atualizar(id, gestor);
    System.out.println("Gestor atualizado com sucesso");
    return "redirect:/gestores";
    }
}


