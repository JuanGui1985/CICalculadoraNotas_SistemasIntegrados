package com.co.calculadoranotas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.calculadoranotas.services.CalcNotasServices;

@RestController
@RequestMapping(value = "/calculadoranotas")
public class CalcNotasController {
	
	@Autowired
	public CalcNotasServices services;

}
