package com.mike.web.datajpa.app.models.service;

import java.util.List;

import com.mike.web.datajpa.app.models.Cliente;

public interface IClienteService {

public List<Cliente> findAll();
	
	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);
	
	public void delete(Long id);

	
}
