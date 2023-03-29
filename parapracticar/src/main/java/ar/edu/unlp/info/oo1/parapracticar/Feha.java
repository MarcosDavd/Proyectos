package ar.edu.unlp.info.oo1.parapracticar;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Feha {

	public static void main(String[] args) {
		System.out.println( "Fecha de mi cumpleaños: " + LocalDate.of(2001, Month.DECEMBER, 30) );
		LocalDate micumple=LocalDate.of(2001, Month.DECEMBER, 30);
		System.out.print(micumple);
		LocalDate ini=LocalDate.of(1999, Month.DECEMBER, 12);
		LocalDate fin=LocalDate.of(1999, Month.DECEMBER, 30);
		boolean es = (micumple.isBefore(fin) && micumple.isAfter(ini));
		if (es) {
			System.out.println("Esta entre las Fechas");
			
		}
		else {
			System.out.println("No esta entre las Fechas");
		}
		long days = ChronoUnit.DAYS.between(ini, fin);
		System.out.println(days);
	}
}
