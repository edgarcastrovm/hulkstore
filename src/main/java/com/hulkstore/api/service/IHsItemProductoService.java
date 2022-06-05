package com.hulkstore.api.service;

import java.util.List;

import com.hulkstore.api.entity.HsItemProducto;

public interface IHsItemProductoService {

	public HsItemProducto buscarPorId(Long itpId);

	public List<HsItemProducto> buscarTodos();

	public List<HsItemProducto> buscarPorEstado();
	
	public List<HsItemProducto> buscarPorProduco();

	public void addItemProducto(HsItemProducto itemProducto);

	public void addListItemProducto(List<HsItemProducto> listItemProducto);

	public void updateItemProducto(HsItemProducto itemProducto);

	public void deleteItemProducto(Long itpId);

}
