package main.java.map.Ordenacao;

public class Evento {

    //atributo
    private String nome;
    private String Atracao;

    public Evento(String nome, String atracao) {
        this.nome = nome;
        Atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return Atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", Atracao='" + Atracao + '\'' +
                '}';
    }
}
