package com.hulkstore.api.service;

import com.hulkstore.api.entity.HsTipoProducto;

public interface IHsTipoProductoService {
	
	public void registroTipoProducto(HsTipoProducto tipoProducto);
	
	public void updateTipoProducto(HsTipoProducto tipoProducto);
	
	public void deleteTipoProducto(Long tipId);
	
}
