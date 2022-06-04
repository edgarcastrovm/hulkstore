package com.hulkstore.api.service;

import com.hulkstore.api.entity.HsPago;

public interface IHsPagoService {
	
	public void registroPago(HsPago pago);
	
	public void updatePago(HsPago pago);
	
	public void deletePago(Long pagId);
}
