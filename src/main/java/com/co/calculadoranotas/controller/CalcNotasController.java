/** 
 * IDE Version: Spring Tool Suite 4 V. 4.21.0
 * jdk version: 17
 *  Postman: V. 10.21
 * */

package com.co.calculadoranotas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.calculadoranotas.services.CalcNotasServices;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/calculadoranotas")
public class CalcNotasController {
	
	@Autowired
	public CalcNotasServices services;
	
	@PostMapping(value = "/definitiva")
	String mensajeDefinitiva(@PathParam(value = "nota1") double nota1, @PathParam(value = "nota2") double nota2, @PathParam(value = "nota3") double nota3) {
		return services.mensajeDefinitiva(nota1, nota2, nota3);
	}

}
