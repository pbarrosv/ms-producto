package com.service.producto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.service.producto.entity.Producto;
import com.service.producto.repository.RepositoryProducto;

@Service
public class ServiceProductoImpl implements ServiceProducto {

	@Autowired
	private RepositoryProducto repositoryProducto;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAllP() {
		return (List<Producto>) repositoryProducto.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto FindByIdP(Integer id) {
		return repositoryProducto.findById(id).orElse(null);
	}

}
