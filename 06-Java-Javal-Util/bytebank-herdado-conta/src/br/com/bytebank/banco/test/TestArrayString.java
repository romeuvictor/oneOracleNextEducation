package br.com.bytebank.banco.test;

import java.util.Iterator;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayString {

	public static void main(String[] args) {
	
		System.out.println("Funcionou!!!");
		
		for(int i=0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
