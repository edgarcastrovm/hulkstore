package com.hulkstore.api.service;

import com.hulkstore.api.entity.HsParametroSistema;

public interface IHsParametroSistemaService {
	
	public void registroParametroSistema(HsParametroSistema parametro);
	
	public void updateParametroSistema(HsParametroSistema parametro);
	
	public void deleteParametroSistema(Long pasId);
}
