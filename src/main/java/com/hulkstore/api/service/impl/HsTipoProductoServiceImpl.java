package com.hulkstore.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hulkstore.api.dao.IHsTipoProductoDao;
import com.hulkstore.api.entity.HsTipoProducto;
import com.hulkstore.api.service.IHsTipoProductoService;

@Service
public class HsTipoProductoServiceImpl  implements IHsTipoProductoService{

	@Autowired
	private IHsTipoProductoDao tipoProductoDao;
	
	@Override
	public HsTipoProducto buscarPorId(Long tipId) {
		return null;
	}

	@Override
	public List<HsTipoProducto> buscarTodos() {
		return (List<HsTipoProducto>) tipoProductoDao.findAll();
	}

	@Override
	public void registroTipoProducto(HsTipoProducto tipoProducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTipoProducto(HsTipoProducto tipoProducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTipoProducto(Long tipId) {
		// TODO Auto-generated method stub
		
	}

}
