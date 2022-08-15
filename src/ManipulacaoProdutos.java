import java.util.Optional;

public class ManipulacaoProdutos {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.setId(0);
		p1.setNome("Água");
		p1.setCategoria(CategoriaEnum.BEBIDA);;
		p1.setPreco(5.50);
		Produto p2 = new Produto();
		p2.setId(1);
		p2.setNome("Salame");
		p2.setCategoria(CategoriaEnum.FRIOS);
		p2.setPreco(14.6);
		Produto p3 = new Produto();
		p3.setId(2);
		p3.setNome("Papel higienico");
		p3.setCategoria(CategoriaEnum.HIGIENE);
		p3.setPreco(200);
		Produto p4 = new Produto();
		p4.setId(3);
		p4.setNome("Candida");
		p4.setCategoria(CategoriaEnum.LIMPEZA);
		p4.setPreco(24.3);
		Produto p5 = new Produto();
		p5.setId(4);
		p5.setNome("Goiaba");
		p5.setCategoria(CategoriaEnum.HORTIFRUTI);
		p5.setPreco(6);
		
		Optional<Produto> existe =
				existe.stream().filter(e -> e.getCategoria() == CategoriaEnum.BEBIDA).findFirst();
				if(existe) {
					System.out.println("");
				}
	}
}
