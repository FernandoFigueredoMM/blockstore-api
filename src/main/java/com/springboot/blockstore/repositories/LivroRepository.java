package com.springboot.blockstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.blockstore.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
