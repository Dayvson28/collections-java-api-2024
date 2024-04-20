package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoCompra;

    public CarrinhoDeCompras() {
        this.carrinhoCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        carrinhoCompra.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!carrinhoCompra.isEmpty()) {
            for (Item i : carrinhoCompra) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(i);
                }
            }
            carrinhoCompra.removeAll(itemParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!carrinhoCompra.isEmpty()){
            for (Item i : carrinhoCompra){
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A Lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!carrinhoCompra.isEmpty()) {
            System.out.println(this.carrinhoCompra);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "carrinhoCompra=" + carrinhoCompra +
                '}';
    }

    public static void main(String[] args) {
        //criando uma istância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        //Exibindo itens do carrinho
        carrinhoDeCompras.exibirItens();

        //Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        //Exibindo itens atualizado do carrinho
        carrinhoDeCompras.exibirItens();

        //Calculando e exebindo o valor total da compra
        System.out.println("O valor total da compra é: R$ " + carrinhoDeCompras.calcularValorTotal());
    }
}
