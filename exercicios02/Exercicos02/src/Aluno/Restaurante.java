package Aluno;

import java.util.ArrayList;
import java.util.HashMap;

public class Restaurante {
    private HashMap<String, Double> cardapio;
    private ArrayList<Mesa> mesas;

    public Restaurante() {
        mesas = new ArrayList<>();
        cardapio = new HashMap<>();
    }

    public void adicionarPrato(String prato, double preco){
        cardapio.put(prato, preco);
    }

    public void pesquisarPrato(String nome){
        if (cardapio.get(nome) == null){
            System.out.println("\nPrato não encontrado!");
        }else{
            System.out.println("Prato: "+nome+"\nPreço: "+cardapio.get(nome));
        }
    }

    public void adicionarMesa(Mesa mesa){
        mesas.add(mesa);
    }

    public void mesaIsDisponivel(Mesa mesa){
        if(mesa.isAberta()){
            System.out.println("\nA mesa está disponível");
        }else{
            System.out.println("\nA mesa não está disponível.");
        }
    }

    public void solicitarConta(Mesa mesa){
        Conta conta = mesa.getConta();
        conta.mostrarPratos();
        System.out.println("\nValor total: "+conta.getValor());
    }

    
}