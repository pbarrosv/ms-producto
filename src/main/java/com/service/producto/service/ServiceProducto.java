package com.service.producto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.service.producto.entity.Producto;
@Service
public interface ServiceProducto {
	public List<Producto> findAllP();
	public Producto FindByIdP(Integer id);
}
