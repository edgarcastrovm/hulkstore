package com.hulkstore.api.service;

import java.util.List;

import com.hulkstore.api.entity.HsPago;

public interface IHsPagoService {
	
	public HsPago buscarPorId(Long pagId);
	
	public List<HsPago> buscarTodos(Long pagId);
	
	public void registroPago(HsPago pago);
	
	public void updatePago(HsPago pago);
	
	public void deletePago(Long pagId);
}
