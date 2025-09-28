	public class produto {
	    private int id;
	    private String nome;
	    private String descricao;
	    private double preco;

	    // Construtor para criar um novo produto (sem ID, pois o DB gera)
	    public produto(String nome, String descricao, double preco) {
	        this.nome = nome;
	        this.descricao = descricao;
	        this.preco = preco;
	    }

	    // Construtor para recuperar um produto do DB (com ID)
	    public produto(int id, String nome, String descricao, double preco) {
	        this.id = id;
	        this.nome = nome;
	        this.descricao = descricao;
	        this.preco = preco;
	    }

	    // Getters e Setters
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

	    @Override
	    public String toString() {
	        return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
	    }
	}

