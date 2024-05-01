package main.java.list.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidados(String nome, int codigoConvidados){
        convidadoSet.add(new Convidado(nome, codigoConvidados));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRmover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRmover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRmover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");

        conjuntoConvidados.adicionarConvidados("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidados("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidados("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidados("Convidado 4", 1236);


        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");

        conjuntoConvidados.exibirConvidados();
    }
}

