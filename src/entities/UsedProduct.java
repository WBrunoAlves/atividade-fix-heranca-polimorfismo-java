package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	/*OBJETO TIPO DATE*/
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date datafabricacao;

	public UsedProduct(String nome, Double peco, Date datafabricacao) {
		super(nome, peco);
		this.datafabricacao = datafabricacao;
	}

	public Date getDataValidade() {
		return datafabricacao;
	}

	public void setDataValidade(Date datafabricacao) {
		this.datafabricacao = datafabricacao;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}
	
	@Override
	public String precoTag(){
		return  getNome() // ATRIBUTO nome da classe Product
			+ "(USADO) "
			+ " $ " 
			+ String.format("%.2f", preco)
			+ "(FABRICADO EM: " 
			+ sdf.format(datafabricacao) // PARA MOSTRAR DATAS CAPTURADAS ,o atributo dataValidade como parametro no método format do objeto sdf
			+ " )";
}
	
	

}
