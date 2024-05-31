package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    //atriubuto
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            proximaData = entry.getKey();
            proximoEvento = entry.getValue();
            System.out.println("O próximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
            break;
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.exibirAgenda();
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 31), "Evento 1,", "Carla Marques");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 16), "Evento 2,", "Carla Marques 'Memórias'");
//        agendaEventos.adicionarEvento(LocalDate.of(2023, 12, 7), "Evento 3,", "Carla ");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 1), "Evento 4,", "Carla Junho ");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 7), "Evento 5,", "Carla Julho");
        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
