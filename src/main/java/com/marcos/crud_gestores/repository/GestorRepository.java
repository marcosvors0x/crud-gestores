package com.marcos.crud_gestores.repository;

import com.marcos.crud_gestores.model.Gestor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestorRepository extends JpaRepository<Gestor, Long> {
}