package com.hulkstore.api.service;

import java.util.List;

import com.hulkstore.api.entity.HsTarjetaCliente;

public interface IHsTarjetaClienteService {
	public HsTarjetaCliente buscarPorId(Long tacId);
	
	public List<HsTarjetaCliente> buscarTodos(Long tacId);
	
	public void registroTarjetaCliente(HsTarjetaCliente tarjetaCliente);
	
	public void updateTarjetaCliente(HsTarjetaCliente tarjetaCliente);
	
	public void deleteTarjetaCliente(Long tacId);
	
}
