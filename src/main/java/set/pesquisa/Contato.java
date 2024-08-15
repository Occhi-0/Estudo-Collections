package set.pesquisa;
import java.util.Objects;

public class Contato {

    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }


    public String getNome() {
        return nome;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Contato contato = (Contato) object;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }



    @Override
    public String toString() {
        return "{" + nome + "," + numero + "}";
    }
}
