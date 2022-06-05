package com.hulkstore.api.service;

import java.util.List;

import com.hulkstore.api.entity.HsTipoProducto;

public interface IHsTipoProductoService {
	public HsTipoProducto buscarPorId(Long tipId);

	public List<HsTipoProducto> buscarTodos();
		
	public void registroTipoProducto(HsTipoProducto tipoProducto);
	
	public void updateTipoProducto(HsTipoProducto tipoProducto);
	
	public void deleteTipoProducto(Long tipId);
	
}
