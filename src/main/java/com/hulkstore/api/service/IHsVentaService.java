package com.hulkstore.api.service;

import com.hulkstore.api.entity.HsVenta;

public interface IHsVentaService {
	
	public void registroVenta(HsVenta venta);
	
	public void updateVenta(HsVenta venta);
	
	public void deleteVenta(Long venId);
	
}
