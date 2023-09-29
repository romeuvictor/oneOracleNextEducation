package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {

	public static void main(String[] args) {
	
		Object[] contas = new Object[5];		
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;
		
		ContaPoupanca cc2 =  new ContaPoupanca(11, 22);
		contas[1] = cc2;
		
		ContaPoupanca ref = (ContaPoupanca) contas[1];
		
		
		System.out.println(ref.getNumero());
//		System.out.println(contas[1].getNumero());
		System.out.println(cc2.getNumero());
		
		
	}

}
