package com.hulkstore.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hulkstore.api.constantes.ConstantesDb;
import com.hulkstore.api.entity.HsProducto;
import com.hulkstore.api.entity.HsTipoProducto;
import com.hulkstore.api.entity.HsVwstock;
import com.hulkstore.api.service.IHsItemProductoService;
import com.hulkstore.api.service.IHsProductoService;
import com.hulkstore.api.service.IHsTipoProductoService;

@RestController
@RequestMapping("/api")
public class StokRestController {

	@Autowired
	IHsTipoProductoService tipoProductoService;
	@Autowired
	IHsProductoService productoService;
	@Autowired
	IHsItemProductoService itemProductoService;

	@GetMapping("/tipo_producto")
	public ResponseEntity<List<?>> listarTipoProducto(){
		List<HsTipoProducto> tipos = tipoProductoService.buscarTodos();
		return new ResponseEntity<List<?>>(tipos,HttpStatus.OK);
	}
	
	@GetMapping("/producto_activo")
	public ResponseEntity<?> listarProductosActivos(){
		List<HsProducto> productos = productoService.buscarPorEstado(ConstantesDb.TIPO_ESTADO_ACTIVO);
		if(productos!=null) {
			return new ResponseEntity<>(productos,HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/ver_stock")
	public ResponseEntity<?> verStock(){
		List<HsVwstock> productos = productoService.verStockProductos();
		if(productos!=null) {
			return new ResponseEntity<>(productos,HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
}
