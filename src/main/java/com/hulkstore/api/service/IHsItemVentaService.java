package com.hulkstore.api.service;

import java.util.List;

import com.hulkstore.api.entity.HsItemVenta;

public interface IHsItemVentaService {
	
	public void registroItemVenta(HsItemVenta itemVenta);

	public void addListItemVenta(List<HsItemVenta> listItemVenta);
	
	public void updateItemVenta(HsItemVenta itemVenta);
	
	public void deleteItemVenta(Long itvId);
	
}
