package com.one.springpj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one.springpj.model.Cafe;

public interface CafeRepository extends JpaRepository<Cafe, Long>{

}
