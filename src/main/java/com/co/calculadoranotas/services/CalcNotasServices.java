/** 
 * IDE Version: Spring Tool Suite 4 V. 4.21.0
 * jdk version: 17
 *  Postman: V. 10.21
 * */

package com.co.calculadoranotas.services;

import org.springframework.stereotype.Service;
import java.text.DecimalFormat;

@Service
public class CalcNotasServices {

	public String mensajeDefinitiva(double nota1, double nota2, double nota3) {
		double definitiva = (nota1 + nota2 + nota3) / 3;
		
		DecimalFormat formatoDecimal = new DecimalFormat("#.##");
		
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
