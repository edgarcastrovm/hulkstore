package com.hulkstore.api.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hulkstore.api.entity.HsCliente;

public interface IHsClienteDao extends CrudRepository<HsCliente, Long>{

	@Query("select p from HsCliente p where p.cliId=?1")
	public HsCliente findByIdSQL(Long Id);
	
	@Query("select p from HsCliente p where p.cliEmail=?1 and p.cliPassword=?2")
	public HsCliente findByLoginSQL(String email, String password);
	
	public HsCliente findByCliEmail(String email);
	
	public  Optional<HsCliente> findById(Long id);
	
}
