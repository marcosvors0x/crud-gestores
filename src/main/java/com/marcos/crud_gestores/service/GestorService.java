package com.marcos.crud_gestores.service;

import com.marcos.crud_gestores.model.Gestor;
import com.marcos.crud_gestores.repository.GestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestorService {

    @Autowired
    private GestorRepository repository;

    public List<Gestor> listar() {
        return repository.findAll();
    }

    public Gestor salvar(Gestor gestor) {
        return repository.save(gestor);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Gestor atualizar(Long id, Gestor gestorAtualizado) {
        Gestor gestorExistente = repository.findById(id).orElse(null);

        if (gestorExistente == null) {
        return null;
        }

        gestorExistente.setNome(gestorAtualizado.getNome());
        gestorExistente.setEmail(gestorAtualizado.getEmail());

        return repository.save(gestorExistente);
    }

    public Gestor buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}