package model;

public class Contato {

	private String nome;
	private int telefone_fixo;
	private String email;
	private int telefone_celular;
	
	public Contato(String nome, int telefone_fixo, String email, int telefone_celular) {
		this.nome = nome;
		this.telefone_fixo = telefone_fixo;
		this.email = email;
		this.telefone_celular = telefone_celular; 
	}
	
	public Contato() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone_fixo() {
		return telefone_fixo;
	}

	public void setTelefone_fixo(int telefone_fixo) {
		this.telefone_fixo = telefone_fixo;
	}

	public int getTelefone_celular() {
		return telefone_celular;
	}

	public void setTelefone_celular(int telefone_celular) {
		this.telefone_celular = telefone_celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}		
	
}
