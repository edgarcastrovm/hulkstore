package com.hulkstore.api.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hulkstore.api.constantes.ConstantesDb;
import com.hulkstore.api.dao.IHsClienteDao;
import com.hulkstore.api.entity.HsCliente;
import com.hulkstore.api.service.IHsClienteService;

@Service
public class HsClienteServiceImpl implements IHsClienteService{
	
	@Autowired
	private IHsClienteDao clienteDao;

	@Override
	@Transactional(readOnly = true)
	public HsCliente buscarPorId(Long cliId) {
		return (HsCliente) clienteDao.findByIdSQL(cliId);
	}

	@Override
	@Transactional(readOnly = true)
	public List<HsCliente> buscarTodos() {
		return  (List<HsCliente>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public HsCliente buscarPorEmail(String email) {
		// TODO Auto-generated method stub
		return (HsCliente) clienteDao.findByCliEmail(email);
	}

	@Override
	public void registroCliente(HsCliente cliente) {
		clienteDao.save(cliente);
	}

	@Override
	public void updateCliente(HsCliente cliente) {
		clienteDao.save(cliente);		
	}

	@Override
	public void deleteCliente(Long cliId) {
		HsCliente clienteDb = (HsCliente) clienteDao.findByIdSQL(cliId);
		if(clienteDb != null) {
			clienteDb.setCliEstado(ConstantesDb.TIPO_ESTADO_INACTIVO);
			clienteDao.save(clienteDb);
		}
	}

	@Override
	@Transactional(readOnly = true)
	public HsCliente checkClientLogin(HsCliente cliente) {
		HsCliente clienteDb = (HsCliente) clienteDao.findByLoginSQL(cliente.getCliEmail(),cliente.getCliPassword());
		if(clienteDb != null) {
			return clienteDb;
		}
		return null;
	}
}
