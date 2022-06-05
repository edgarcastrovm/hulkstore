package com.hulkstore.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hulkstore.api.entity.HsItemProducto;
import com.hulkstore.api.entity.HsProducto;

public interface IHsItemProductoDao extends CrudRepository<HsItemProducto, Long> {

	@Query("select p from HsItemProducto p where p.itpId=?1")
	public HsItemProducto findByIdSQL(Long Id); 
	
	public List<HsItemProducto> findByItpEstado(String estado); 

	public List<HsItemProducto> findByProId(HsProducto producto); 
}
