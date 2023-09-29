package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//Generics
		List<Conta> lista = new ArrayList<Conta>();
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		Conta cc = new ContaCorrente(22,11);
		lista.add(cc);
		
		Conta cp = new ContaPoupanca(22,22);
		lista.add(cp);
		
		System.out.println("Tamanho: " +lista.size());		
		Conta ref = lista.get(0);		
		System.out.println(ref.getNumero());
		
		//lista.remove(0);
		System.out.println("Tamanho: " +lista.size());		
		
		Conta cc2 = new ContaCorrente(33,11);
		lista.add(cc2);
		
		Conta cp2 = new ContaPoupanca(33,44);
		lista.add(cp2);
		
		for(int i = 0; i < lista.size(); i++) {
			Conta oRef = lista.get(i);
			System.out.println(oRef);					
		}
		
		System.out.println("--------------------------------------");			
		
		for(Conta conta : lista) {
			System.out.println(conta);			
		}
	}

}
