package main.java.list.Ordanacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumeros(int numero){
        listaNumeros.add(numero);
    }

    public List<Integer> calcularSoma(){
        List<Integer> calcularSoma = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()) {
            int soma = 0;
            for (int n : listaNumeros) {
                soma += n;
            }
            return Collections.singletonList(soma);
        }return calcularSoma;
    }

    public List<Integer> calcularMaiorNumero(){
        List<Integer> maiorNumero = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()){
            Collections.sort(maiorNumero);
            return maiorNumero;
        }else{
            throw new RuntimeException("A Lista está vazia!");
        }

    }

    public List<Integer> calcularMenorNumero(){
        List<Integer> menorNumero = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()){
            menorNumero.sort(Collections.reverseOrder());
            return menorNumero;
        }else{
            throw new RuntimeException("A Lista está vazia!");
        }

    }

    public void exibirNumeros(){
        if (!listaNumeros.isEmpty()){
            System.out.println(this.listaNumeros);
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumeros(2);
        somaNumeros.adicionarNumeros(8);
        somaNumeros.adicionarNumeros(11);
        somaNumeros.adicionarNumeros(1);
        somaNumeros.adicionarNumeros(55);
        somaNumeros.adicionarNumeros(110);


        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.calcularMaiorNumero());
        System.out.println(somaNumeros.calcularMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
