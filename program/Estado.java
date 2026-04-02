package program;


public class Estado {
    private String nome;
    private boolean ehFinal;

    public Estado(String nome, boolean ehFinal) {
        this.nome = nome;
        this.ehFinal = ehFinal;
    }

    public String getNome() { return nome; }
    public boolean isFinal() { return ehFinal; }
}

