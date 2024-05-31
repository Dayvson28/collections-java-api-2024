package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    //atributo
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String linguagem, Integer contagem){
        palavras.put(linguagem,contagem);
    }

    public void removerPalavra(String palavra){
        if(!palavras.isEmpty()){
            palavras.remove(palavra);
        }else{
            System.out.println("O Map está vazio.");
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for(int contagem : palavras.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavrasMaisFrequentes(){
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : palavras.entrySet()){
            if(entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return  linguagemMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        //exibe a contagem total de linguagens
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");

        //adiciona linguagens a sua contagem
        contagemPalavras.adicionarPalavra("Java", 2);
        contagemPalavras.adicionarPalavra("Python", 8);
        contagemPalavras.adicionarPalavra("JavaScript", 1);
        contagemPalavras.adicionarPalavra("C#", 6);

        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");

        //remove linguagem da sua contagem
        contagemPalavras.removerPalavra("JavaScript");
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");

        //Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemPalavras.encontrarPalavrasMaisFrequentes();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
