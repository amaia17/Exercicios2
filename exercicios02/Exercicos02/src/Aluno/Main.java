package Aluno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int escolha = 0;

        Restaurante r = new Restaurante();
        Mesa m = new Mesa();
        Conta c = new Conta();

        r.adicionarPrato("Prato 1", 12);
        r.adicionarPrato("Prato 2", 12);
        r.adicionarPrato("Prato 3", 12);
        r.adicionarPrato("Prato 4", 12);

        m.setGarcom("Jorge");
        m.setConta(c);
        m.setAberta(true);

        r.adicionarMesa(m);

        c.adicionarPedido("Prato 1", 12, 2);
        c.adicionarPedido("Prato 2", 12, 1);
        c.adicionarPedido("Prato 3", 12, 1);
        do {
            System.out.println(
                    "\n-----Selecione uma opção-----\n1 - Buscar prato;\n2 - Verificar disponibilidade de mesa;\n3 - Solicitar conta;\n4 - Sair.");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    r.pesquisarPrato("Prato 1");
                    break;
                case 2:
                r.mesaIsDisponivel(m);
                    
                    break;
                case 3:
                r.solicitarConta(m);
                    break;
            }
            
        } while (escolha != 4);
        if(escolha==4){
            System.out.println("\nPrograma encerrado!");
        }
        entrada.close();
    }
}
