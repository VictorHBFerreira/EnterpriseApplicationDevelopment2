package br.com.fiap.revisao.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteDatas {

	public static void main(String[] args) {
		//Instanciar um Calendar com a data atual
		Calendar hoje = Calendar.getInstance();
		Calendar carnaval = new GregorianCalendar(2020, Calendar.FEBRUARY, 22);
		
		//Objeto para formatar a data
		SimpleDateFormat formatador = 
				new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Exibir a data do calendar
		System.out.println(formatador.format(hoje.getTime()));
		System.out.println(formatador.format(carnaval.getTime()));
	}
	
}