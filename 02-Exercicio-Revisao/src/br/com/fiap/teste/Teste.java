package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.Conta;
import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;
import br.com.fiap.exception.SaldoInsuficienteException;

public class Teste {

	public static void main(String[] args) {
		
		//Instanciar uma conta corrente e poupança
		ContaCorrente cc = new ContaCorrente(1, 2, 
			Calendar.getInstance() , 1040, TipoConta.COMUM);
		
		ContaPoupanca cp = new ContaPoupanca(1, 3, 
			new GregorianCalendar(2018, Calendar.NOVEMBER, 2), 200, 1);
		
		//Criar uma lista de conta
		List<Conta> contas = new ArrayList<Conta>();
		//Adicionar 3 contas na lista
		contas.add(cc);
		contas.add(cp);
		contas.add(new ContaCorrente(2, 4, 
				Calendar.getInstance(), 500, TipoConta.ESPECIAL));
		
		//Exibir o saldo das contas
		for (Conta c : contas) {
			System.out.println(c.getSaldo());
		}
		
		//Chamar o método retirar da conta corrente
		try {
			cc.retirar(5000);
			System.out.println("Saque efetuado");
		}catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
}




