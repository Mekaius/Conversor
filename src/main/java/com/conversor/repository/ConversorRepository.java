package com.conversor.repository;

import org.springframework.data.repository.CrudRepository;

import com.conversor.models.conversorValores;

public interface ConversorRepository extends CrudRepository<conversorValores, String> {

}
