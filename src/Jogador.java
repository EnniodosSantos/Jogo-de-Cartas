import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Jogador {
    private final String nome;
    private final List<Carta> mao;

    public Jogador(String nome) {
        this.nome = Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.mao = new ArrayList<>();
    }

    public void receberCarta(Carta carta) {
        mao.add(Objects.requireNonNull(carta, "Carta não pode ser nula"));
    }

    public Carta jogarCarta(int indice) {
        if (indice < 0 || indice >= mao.size()) {
            throw new IllegalArgumentException("Índice inválido: " + indice);
        }
        return mao.remove(indice);
    }

    public String getNome() {
        return nome;
    }

    public List<Carta> getMao() {
        return Collections.unmodifiableList(mao);
    }

    public int getQuantidadeCartas() {
        return mao.size();
    }


}

