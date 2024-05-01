package main.java.list.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){
            if(palavrasUnicas.contains(palavra)){
                palavrasUnicas.remove(palavra);
            }else{
                System.out.println("Palavra não encontrada no conjunto!");
            }
        }else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasUnicas.isEmpty()) {
            System.out.println(palavrasUnicas);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        //Adicionando linguagens únicas as conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        //Exibindo as linguagens no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        //Removendo as linguagens do conjunto
        conjuntoLinguagens.removerPalavra("python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        //Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        //verificando se a linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("python"));

        //exibindo as lnguagens únicas atiluzadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
