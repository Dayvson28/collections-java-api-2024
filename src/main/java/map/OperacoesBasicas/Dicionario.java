package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    private void adicionarPalavras(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    private void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    private void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    private String pesquisarPorPalavra(String palavra){
        String palavraPorNome = null;
        if(!dicionarioMap.isEmpty()){
            palavraPorNome = dicionarioMap.get(palavra);
        }
        return palavraPorNome;
    }


    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavras("Amor", "Amor a vida");
        dicionario.adicionarPalavras("Amor", "Amor ao amor");
        dicionario.adicionarPalavras("Vida", "Amor a vida");
        dicionario.adicionarPalavras("Sonho", "sonho de amor");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Amor");
        dicionario.exibirPalavras();

        System.out.println("A palavra é: " + dicionario.pesquisarPorPalavra("Sonho"));
    }
}
