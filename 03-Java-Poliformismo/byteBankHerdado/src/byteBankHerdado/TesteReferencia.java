package byteBankHerdado;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();	
		g1.setNome("Romeu");
		g1.setSalario(5000.0);
		
			
		EditorVideo ev =  new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.resgistra(g1);
		controle.resgistra(ev);
		controle.resgistra(d);
		
		System.out.println(controle.getSoma());

	}

}
