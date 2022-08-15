
public class Produto {
	private int id;
	private String nome;
	private Enum categoria;
	private double preco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Enum getCategoria() {
		return categoria;
	}
	public void setCategoria(Enum categotia) {
		this.categoria = categotia;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
