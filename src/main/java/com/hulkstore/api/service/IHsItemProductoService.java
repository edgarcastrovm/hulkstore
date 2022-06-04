package com.hulkstore.api.service;

import java.util.List;

import com.hulkstore.api.entity.HsItemProducto;

public interface IHsItemProductoService {

	public void addItemProducto(HsItemProducto itemProducto);
	
	public void addListItemProducto(List<HsItemProducto> listItemProducto);
	
	public void updateItemProducto(HsItemProducto itemProducto);
	
	public void deleteItemProducto(Long itpId);
	
}
