package polimorfismo.view;
import polimorfismo.model.*;
public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("Vassoura");
		Produto p2 = new Produto("fosforo", 1.50);
		Produto p3 = new Produto("cigarro", 2.50, 10);
		
		p1.exibir(p1.getNome());
		p2.exibir(p2.getNome(),p2.getPreco());
		p3.exibir(p3.getNome(),p3.getPreco(),p3.getQtd());
	}
	

}
