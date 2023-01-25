package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class InstanciaDataeHoraEmJava {

	public static void main(String[] args) {
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		// comando para instanciar data local
		LocalDate d01 = LocalDate.now();
		// comando para instanciar data e hora local
		LocalDateTime d02 = LocalDateTime.now();
		// comando para instanciar data e hora internacional horario de londres
		Instant d03 = Instant.now();

		// comando para transformar: Texto ISO 8601 em Data local
		LocalDate d04 = LocalDate.parse("2022-07-20");
		// comando para transformar: Texto ISO 8601 em Data e hora
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		// comando para transformar: Texto ISO 8601 em Data e hora internacional horario de londres
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		// comando para transformar: Texto ISO 8601 em Data e hora passando como referencia um valor
		// para adicionar ou subitrair do horario internacional de londres
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		// necessario usar o DateTimeFormatter para transformar em data-hora java
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		// estilo onde voce pode passar um dado de cada vez, sendo o primeiro ano, mes, dia
		LocalDate d10 = LocalDate.of(2022, 07, 20);
		// ano, mes, dia, hora, minutos
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		
		System.out.println("--------------------------------------------------------");
		
		
		
		
		
	}

}
