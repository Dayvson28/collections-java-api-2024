package main.java.list.Ordanacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> ordenacaoPessoa;

    public OrdenacaoPessoas() {
        this.ordenacaoPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        ordenacaoPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(ordenacaoPessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(ordenacaoPessoa);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println("Lista Pura sem tratamento: " + ordenacaoPessoas.ordenacaoPessoa);
        System.out.println("Lista ordenada po Idade: " +ordenacaoPessoas.ordenarPorIdade());
        System.out.println("Lista ordenada por Altura: " +ordenacaoPessoas.ordenarPorAltura());
    }
}
