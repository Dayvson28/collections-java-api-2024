package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaCotatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaCotatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
        agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaCotatos agendaCotatos = new AgendaCotatos();

        agendaCotatos.adicionarContato("Dayvson", 123456789);
        agendaCotatos.adicionarContato("Dayvson", 567);
        agendaCotatos.adicionarContato("Dayvson Medeiros", 111111111);
        agendaCotatos.adicionarContato("Dayvson DIO", 654789);
        agendaCotatos.adicionarContato("Maria Silva", 111111111);
        agendaCotatos.adicionarContato("Dayvson", 4444);

        agendaCotatos.exibirContato();

        agendaCotatos.removerContato("Maria Silva");
        agendaCotatos.exibirContato();

        System.out.println(" O número é: " + agendaCotatos.pesquisarPorNome("Dayvson DIO"));
    }
}
