package entities;

public class Product {
	protected String nome;
	protected Double preco;
	
	public Product(String nome, Double peco) {
		this.nome = nome;
		this.preco = peco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeco() {
		return preco;
	}

	public void setPeco(Double peco) {
		this.preco = peco;
	}
	
	public String precoTag(){
			return nome 
				+ " $ " 
				+ String.format("%.2f", preco);
	}
	
	

 }
