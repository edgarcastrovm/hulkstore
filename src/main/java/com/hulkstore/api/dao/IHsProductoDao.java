package com.hulkstore.api.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hulkstore.api.entity.HsProducto;

public interface IHsProductoDao extends CrudRepository<HsProducto, Long> {

	public List<HsProducto> findByProEstado(String estado);
}
