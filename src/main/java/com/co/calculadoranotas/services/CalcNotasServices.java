/** 
 * IDE Version: Spring Tool Suite 4 V. 4.21.0
 * jdk version: 17
 *  Postman: V.
 *  DESARROLLADORES
 *  Brayan Andrés Sepúlveda Garnica
 *  Juan Camilo Benavidez Díaz
 *  Fabián Hernando Cortes Jamaica
 *  Juan Guillermo Muñoz Jaramillo
 * */

package com.co.calculadoranotas.services;

import org.springframework.stereotype.Service;
import java.text.DecimalFormat;

@Service
public class CalcNotasServices {

	// Declaración de la variable que llama el controlador para capturar los parámetros a calcular de la URL
	public String mensajeDefinitiva(double nota1, double nota2, double nota3) {
		double definitiva = (nota1 + nota2 + nota3) / 3;
		
		// Se crea la entidad formatoDecimal, con la cual se dará formato de dos decimales a la nota definitiva en la respuesta
		DecimalFormat formatoDecimal = new DecimalFormat("#.##");
		
		// Se configura el mensaje que se mostrará en el JSON respuesta
		String mensaje = null;
			if(definitiva >= 3.0) {
				mensaje = "Estado: Aprobado \nDefinitiva: " + formatoDecimal.format(definitiva);
			}
			else {
				mensaje = "Estado: Reprobado \nDefinitiva: " + formatoDecimal.format(definitiva);
			}
		return mensaje;
	}
}
