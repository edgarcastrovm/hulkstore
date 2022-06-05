package com.hulkstore.api.service;

import java.util.List;

import com.hulkstore.api.entity.HsVenta;

public interface IHsVentaService {
	
	public HsVenta buscarPorId(Long venId);
	
	public List<HsVenta> buscarTodos(Long venId);
	
	public void registroVenta(HsVenta venta);
	
	public void updateVenta(HsVenta venta);
	
	public void deleteVenta(Long venId);
	
}
