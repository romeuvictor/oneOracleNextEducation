package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorReferencias {

	public static void main(String[] args) {


	GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22,33);
		guardador.adiciona(cc);
		
		Conta cp = new ContaPoupanca(44,55);
		guardador.adiciona(cp);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref.getNumero());
		
		Conta ref2 = (Conta) guardador.getReferencia(1);
		System.out.println(ref2.getNumero());
	}

}
