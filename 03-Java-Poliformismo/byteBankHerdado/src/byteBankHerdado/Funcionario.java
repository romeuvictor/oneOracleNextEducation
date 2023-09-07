package byteBankHerdado;

//Não pode instanciar criar objetos dessa classe, pq é abstrata
public abstract class Funcionario {	
	
	private int senha;	
	private String nome;
	private String cpf;
	private double salario;
	
	//Metodo sem corpo, nao ha implementacao
	public abstract double getBonificacao();
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
		
}
