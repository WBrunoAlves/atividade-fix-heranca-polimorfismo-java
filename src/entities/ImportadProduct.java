package entities;

public class ImportadProduct extends Product{
	
	private Double taxaAlfandega;


	public ImportadProduct(String nome, Double peco, Double taxaAlfandega) {
		super(nome, peco);
		this.taxaAlfandega = taxaAlfandega;
	}


	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}


	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public double totalPreco(){
		return getPeco() + taxaAlfandega;
	}
   
	@Override
	public String precoTag(){
		return getNome()  
			+ " $ " 
			+ String.format(" %.2f ", totalPreco())
			+ " Incluido valor de taxa de alfandega : $ "
			+ String.format("%.2f", taxaAlfandega);
}

	

	

	
	
}
