package com.hulkstore.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hulkstore.api.constantes.ConstantesDb;
import com.hulkstore.api.dao.IHsProductoDao;
import com.hulkstore.api.dao.IHsVwstockDao;
import com.hulkstore.api.entity.HsProducto;
import com.hulkstore.api.entity.HsVwstock;
import com.hulkstore.api.service.IHsProductoService;

@Service
public class HsProductoServiceImpl implements IHsProductoService {

	@Autowired
	private IHsProductoDao productoDao;
	@Autowired
	private IHsVwstockDao vwstockDao;
	
	@Override
	public List<HsProducto> buscarTodos() {
		List<HsProducto> lista = (List<HsProducto>) productoDao.findAll();
		if(lista != null)
			return lista;
		return null;
	}

	@Override
	public List<HsProducto> buscarPorEstado(String estado) {
		List<HsProducto> lista = (List<HsProducto>) productoDao.findByProEstado(estado);
		if(lista != null)
			return lista;
		return null;
	}

	@Override
	public List<HsVwstock> verStockProductos() {
		return (List<HsVwstock>) vwstockDao.findAll();
	}

}
