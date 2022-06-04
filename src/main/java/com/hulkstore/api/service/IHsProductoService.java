package com.hulkstore.api.service;

import com.hulkstore.api.entity.HsProducto;

public interface IHsProductoService {
	
	public void registroProducto(HsProducto producto);
	
	public void updateProducto(HsProducto producto);
	
	public void deleteProducto(Long cliId);
	
}
