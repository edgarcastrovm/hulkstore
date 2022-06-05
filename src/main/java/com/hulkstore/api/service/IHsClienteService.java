package com.hulkstore.api.service;

import java.util.List;

import com.hulkstore.api.entity.HsCliente;

public interface IHsClienteService {

	public HsCliente buscarPorId(Long cliId);

	public List<HsCliente> buscarTodos();
	
	public HsCliente buscarPorEmail(String email);
	
	public void registroCliente(HsCliente cliente);
	
	public void updateCliente(HsCliente cliente);
	
	public void deleteCliente(Long cliId);
	
	public HsCliente checkClientLogin(HsCliente cliente);
}
