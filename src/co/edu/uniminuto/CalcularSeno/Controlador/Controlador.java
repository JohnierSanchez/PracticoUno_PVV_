package co.edu.uniminuto.CalcularSeno.Controlador;

import co.edu.uniminuto.CalcularSeno.Modelo.Modelo;

/**
 * Clase Controlador,La cual conecta los datos que va a necesitar la Clase
 * Modelo con los registrados en la Clase Vista, del mismo modo para mostrar el
 * resultado.
 * 
 * @autor S�nchez Johnier
 * @version 16/02/20 Copyright 2020 por S�nchez Johnier 
 * Programa realizado con estructura MVC para el c�lculo de la Funci�n Seno, 
 * por medio de la Serie Taylor.
 */

public class Controlador {
	/**
	 * Se realiza el m�todo calcular para llevar los datos y sustraer el resultado.
	 */
	public double calcular(double num, double exa) {
		Modelo m = new Modelo();
		return m.calcularSeno(num, exa);

	}

}
