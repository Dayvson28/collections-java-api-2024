package main.java.list.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //atributos
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vázio!");
        }
        if (tarefaParaRemover == null) {
            System.out.println("tarefa não encontrada");
        }
    }

    public void exibirTarefa() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Lista não encontrada");
        }
    }

    public int contarTarefa() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
            Set<Tarefa> tarefasConcluidas = new HashSet<>();
            for (Tarefa t : tarefaSet) {
                if (t.isConcluido()) {
                    tarefasConcluidas.add(t);
                }
            }
            return tarefasConcluidas;
        }


    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConcluido()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descicao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descicao)) {
                t.setConcluido(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }
        if (tarefaParaMarcarComoPendente != null) {
            if(tarefaParaMarcarComoPendente.isConcluido()){
                tarefaParaMarcarComoPendente.setConcluido(false);
            }
        }else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefa(){
        if(tarefaSet.isEmpty()){
            System.out.println("A lista ja está vazia!");
        }else {
            tarefaSet.clear();
        }
    }


    public static void main(String[] args) {
        //Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        //Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Varrer Casa");
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Ir para Academia");
        listaTarefas.adicionarTarefa("Organizar escrivaninha");
        listaTarefas.adicionarTarefa("Trabalhar!!");

        listaTarefas.exibirTarefa();

        //Removendo uma Tarefa
        listaTarefas.removerTarefa("Ir para Academia");
        listaTarefas.exibirTarefa();

        //Contando o número de tarefas na lista
        System.out.println("total de tarefas na lista " + listaTarefas.contarTarefa());

        //Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Organizar escrivaninha");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        //Obtendo tarefas concluidas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        //Marcando tarefas como Pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefa();

        //Limpando a lista de tarefas
        listaTarefas.limparListaTarefa();
        listaTarefas.exibirTarefa();
    }
}
