public class Produto{

    private int cdg;
    private String cor;
    private String categoria;
    private String nome;
    private int cep;

    public Produto(){
    }
     public Produto(int cdg, String cor, String categoria, String nome, int cep) {
            this.cdg = cdg;
            this.cor = cor;
            this.categoria = categoria;
            this.nome = nome;
            this.cep = cep;
    }
    public Produto(int cdg, String categoria, String nome) {
            this.cdg = cdg;
            this.categoria = categoria;
            this.nome = nome;
    }
    public Produto(int cdg, String cor, String categoria, int cep) {
            this.cdg = cdg;
            this.cep = cep;
    }

    public void setCdg(int cdg) {
        this.cdg = cdg;
    }
    public int getCdg() {
        return cdg;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria.toUpperCase();
    }
    public String getCategoria() {
        return categoria;
    }
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
    public String getNome() {
        return nome;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public int getCep() {
        return cep;
    }

}