package com.service.producto.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.producto.entity.Producto;
import com.service.producto.service.ServiceProducto;

@RestController
public class ControllerProducto {
	
	@Autowired
	private Environment env;
	@Autowired
	private ServiceProducto serviceProducto;
	
	@GetMapping("/Listar")
	public List<Producto> listar(){
		return serviceProducto.findAllP().stream().map(producto -> {
			producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
			return producto;
		}).collect(Collectors.toList());
		//return serviceProducto.findAllP();
	}
	
	@GetMapping("/ListforId/{id}")
	public Producto detalle(@PathVariable Integer id) {
		Producto producto = serviceProducto.FindByIdP(id);
		producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return producto;
		//return serviceProducto.FindByIdP(id);
		
	}
}
