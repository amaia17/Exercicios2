package Professor;

import java.util.ArrayList;
import java.util.Iterator;

public class Comissao{
    private ArrayList <Membro> membros;
    Iterator <Membro> it;

    public Comissao(int numeroPortaria) {
        membros = new ArrayList <Membro>();
    }

    public void pesquisarMembro(String nome){
        it = membros.iterator();
        boolean existe = false;;
        while(it.hasNext()){
            Membro m1 = (Membro) it.next();
            if(m1.getNome() == nome){
                existe = true;
            }
        }
        if(existe){
            System.out.println(nome+" faz parte da comissão.");
        }else{
            System.out.println(nome+" não foi encontrado(a).");
        }
    }

    public void listarMembros(){
        it = membros.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

    public void adicionarMembro(Membro membro){
        membros.add(membro);
    }
}
