package com.hulkstore.api.service;

import java.util.List;

import com.hulkstore.api.entity.HsParametroSistema;

public interface IHsParametroSistemaService {
	
	public HsParametroSistema buscarPorId(Long pasId);
	
	public List<HsParametroSistema> buscarTodos(Long pasId);
	
	public void registroParametroSistema(HsParametroSistema parametro);
	
	public void updateParametroSistema(HsParametroSistema parametro);
	
	public void deleteParametroSistema(Long pasId);
}
