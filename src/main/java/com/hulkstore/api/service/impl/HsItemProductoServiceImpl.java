package com.hulkstore.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hulkstore.api.dao.IHsItemProductoDao;
import com.hulkstore.api.entity.HsItemProducto;
import com.hulkstore.api.service.IHsItemProductoService;

@Service
public class HsItemProductoServiceImpl implements IHsItemProductoService {

	@Autowired
	private IHsItemProductoDao itemProductoDao;
	
	@Override
	public HsItemProducto buscarPorId(Long itpId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HsItemProducto> buscarTodos() {
		return (List<HsItemProducto>) itemProductoDao.findAll();
	}

	@Override
	public List<HsItemProducto> buscarPorEstado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HsItemProducto> buscarPorProduco() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addItemProducto(HsItemProducto itemProducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addListItemProducto(List<HsItemProducto> listItemProducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateItemProducto(HsItemProducto itemProducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItemProducto(Long itpId) {
		// TODO Auto-generated method stub
		
	}

}
