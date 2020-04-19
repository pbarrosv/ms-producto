package com.service.producto.repository;

import org.springframework.data.repository.CrudRepository;

import com.service.producto.entity.Producto;

public interface RepositoryProducto extends CrudRepository<Producto, Integer> {

}
