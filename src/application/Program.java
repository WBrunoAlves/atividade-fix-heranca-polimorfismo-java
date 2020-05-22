package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportadProduct;
import entities.Product;
import entities.UsedProduct;


/*
 * Fazer um programa para ler os dados de N
produtos (N fornecido pelo usuário). Ao final,
mostrar a etiqueta de preço de cada produto na
mesma ordem em que foram digitados.
Todo produto possui nome e preço. Produtos
importados possuem uma taxa de alfândega, e
produtos usados possuem data de fabricação.Estes
dados específicos devem ser acrescentados na etiqueta de preço conforme
exemplo. Para produtos
importados, a taxa e alfândega deve ser
acrescentada ao preço final do produto.
Favor implementar o programa conforme
projeto ao lado.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // dipot Date formato
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Entre com numero de produtos:");
	    int n = sc.nextInt();
	    
	    for (int i = 1; i <= n; i++) {
	    	System.out.println("Product #" + i +" data:");
			System.out.println("Comun, usado ou importado (c/u/i)?");
			char type = sc.next().charAt(0);
			System.out.println("Nome: ");
			String nameProduct = sc.nextLine();
			sc.nextLine();
			System.out.println("Preço: ");
			double precoProduct = sc.nextDouble();
			
			if (type == 'c') {
//SE O TYPE FOR C ENTÃO ADICIONAR NA LISTA UM OBJETO Product com parametros
				list.add(new Product(nameProduct, precoProduct));
			
			}else if (type =='u') {
				System.out.println("Data fabricacao do Produto: ");
				Date date = sdf.parse(sc.next()); // MANEIRA DE COMO CAPTURAR UMA DATA DO USUARIO usando tipo Date
				list.add(new UsedProduct(nameProduct, precoProduct, date));
				
			}else if (type == 'i') {
				System.out.println("Taxa de alfandega: ");
				double taxa = sc.nextDouble();			
				list.add(new ImportadProduct( nameProduct, precoProduct, taxa));
			}
			
			
		}
	    /*FAZER UM FOR EACH PARA PERCORRER A LISTA E MOSTRAR TUDO pelo método que foi criado e sobrescrito precoTag()*/
	    System.out.println();
	    System.out.println("PRICE TAGS:");
	    for (Product prod : list) {
	    	System.out.println(prod.precoTag());
			
		}
		
		
		
		sc.close();
	}

}
