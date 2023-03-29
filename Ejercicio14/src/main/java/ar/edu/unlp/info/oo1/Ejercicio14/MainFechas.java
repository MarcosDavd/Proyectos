package ar.edu.unlp.info.oo1.Ejercicio14;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class MainFechas {

	public static void main(String[] args) {
		LocalDate fecha,inicio,fin;
		inicio=LocalDate.of(2012, Month.MAY, 1);
		fin =LocalDate.of(2023, Month.MAY, 1);
		fecha=LocalDate.of(2021, Month.DECEMBER, 30);
		if(fecha.isAfter(inicio)&&fecha.isBefore(fin)) {
			System.out.println("SI");
		}
		System.out.println(ChronoUnit.DAYS.between(fecha, fin));
	}

}
