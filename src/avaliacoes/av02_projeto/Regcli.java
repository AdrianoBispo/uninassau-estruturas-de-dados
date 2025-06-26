package avaliacoes.av02_projeto;

public class Regcli {
    private String codigo;
    private String nome;
    private String pais;

    public Regcli(String codigo, String nome, String pais) {
        this.codigo = codigo;
        this.nome = nome;
        this.pais = pais;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
}