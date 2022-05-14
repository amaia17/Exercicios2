package Professor;

public class Membro {
    private String nome, prontuario;

    public Membro(String nome, String prontuario) {
        this.nome = nome;
        this.prontuario = prontuario;

    }

    @Override
    public String toString() {
        return "\nMembro \nNome: " + nome + "\nProntuário: " + prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

}
