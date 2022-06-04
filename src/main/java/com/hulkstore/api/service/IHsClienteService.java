package com.hulkstore.api.service;

import com.hulkstore.api.entity.HsCliente;

public interface IHsClienteService {
	
	public void registroCliente(HsCliente cliente);
	
	public void updateCliente(HsCliente cliente);
	
	public void deleteCliente(Long cliId);
	
	public void checkClientLogin(HsCliente cliente);
}
