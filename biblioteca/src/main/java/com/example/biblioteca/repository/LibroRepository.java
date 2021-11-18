package com.example.biblioteca.repository;

import com.example.biblioteca.models.Libro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long>{
    
}
