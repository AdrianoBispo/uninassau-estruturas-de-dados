package manipulacao_de_arquivo;

public class RegistrarProduto {
	    private int codigo;
	    private String descricao;
	    private double preco;
	    private int quantidade;
	    private int categoria;

	    public RegistrarProduto(int codigo, String descricao, double preco, int quantidade,  int categoria) {
	        this.codigo = codigo;
	        this.descricao = descricao;
	        this.preco = preco;
	        this.quantidade = quantidade;
	        this.categoria = categoria;
	    }
	    public int getCodigo() {
	        return codigo;
	    }
	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }
	    public String getDescricao() {
	        return descricao;
	    }
	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }
	    public double getPreco() {
	        return preco;
	    }
	    public void setPreco(double preco) {
	        this.preco = preco;
	    }
	    public int getQuantidade() {
	        return quantidade;
	    }
	    public void setQuantidade(int quantidade) {
	        this.quantidade = quantidade;
	    }
	    public int getCategoria() {
	        return categoria;
	    }
	    public void setCategoria(int categoria) {
	        this.categoria = categoria;
	    }
	}
