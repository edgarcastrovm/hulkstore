package com.hulkstore.api.service;

import com.hulkstore.api.entity.HsTarjetaCliente;

public interface IHsTarjetaClienteService {
	
	public void registroTarjetaCliente(HsTarjetaCliente tarjetaCliente);
	
	public void updateTarjetaCliente(HsTarjetaCliente tarjetaCliente);
	
	public void deleteTarjetaCliente(Long tacId);
	
}
