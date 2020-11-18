package com.mike.web.datajpa.app.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.mike.web.datajpa.app.models.Cliente;

public interface IClienteDao extends CrudRepository<Cliente,Long>{
	

}
