package Professor;

public class Main {
    public static void main(String[] args) {
        Membro membro2 = new Membro("Alessandra Maia", "BP3010422");
        Membro membro = new Membro("Alinne Gomes", "BP3012794");

        Comissao comissao = new Comissao(10);

        System.out.println("\nTestando método toString():");
        System.out.println(membro.toString());
        System.out.println(membro2.toString());

        comissao.adicionarMembro(membro);
        
        System.out.println("\nListando membros da comissão:");
        comissao.listarMembros();

        System.out.println("\nPesquisando membros: ");
        comissao.pesquisarMembro("Alessandra Maia");
        comissao.pesquisarMembro("Alinne Gomes");
    }
}
