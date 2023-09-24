package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

	//Array[]
	public static void main(String[] args) {
		
		int[] idade = new int[5];// inicializa o array com os valores padrões int é o 0
		
		
		for(int i = 0; i < idade.length; i++) {
			idade[i] = i * i;
		}
		
		for(int i = 0; i < idade.length; i++) {
			System.out.println(idade[i]);
		}
		
		
		
		
//		int idade1 = idade[0];
//		idade[0] = 23;
//		idade[1] = 24;
//		idade[2] = 19;
//		idade[3] = 69;
//		idade[4] = 89;
//		
//		
//		int idade4 = idade[4];
//		System.out.println(idade4);
//		
//		System.out.println(idade.length);
//		
	

	}

}
