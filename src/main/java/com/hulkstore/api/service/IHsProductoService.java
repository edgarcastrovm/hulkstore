package com.hulkstore.api.service;

import java.util.List;

import com.hulkstore.api.entity.HsProducto;
import com.hulkstore.api.entity.HsVwstock;

public interface IHsProductoService {

	public List<HsProducto> buscarTodos();

	public List<HsProducto> buscarPorEstado(String estado);
	
	public List<HsVwstock> verStockProductos();
}
