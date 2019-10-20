package com.fandroide.msa.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/msa/inventario")
public class InventarioController {
	
	@RequestMapping(value="/demo", method=RequestMethod.GET)
	public String demo() {
		System.out.println("OLA K ACE");
		return "hola mundo, k ace";
	}
	
	@RequestMapping(value="/obtenerInventario", method=RequestMethod.POST)
	public String inventario(@RequestBody String request) {
		System.out.println("Request: "+request);
		return "hola mundo";
	}
}
