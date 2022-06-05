package com.hulkstore.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hulkstore.api.entity.HsCliente;
import com.hulkstore.api.service.IHsClienteService;

@RestController
@RequestMapping("/api")
public class ClienteRestController {
	@Autowired
	private IHsClienteService clienteService;
	
	@GetMapping("/clientes")
	public ResponseEntity<?> listarTodosClientes(){
		List<HsCliente> clientes = clienteService.buscarTodos();
		return new ResponseEntity<List<HsCliente>>(clientes,HttpStatus.OK);
	}
}
