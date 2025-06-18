import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Baralho {
    private final List<Carta> cartas;
    private final List<Carta> descarte;

    public Baralho() {
        this.cartas = new ArrayList<>();
        this.descarte = new ArrayList<>();
        inicializarBaralho();
    }

    protected void inicializarBaralho() {
        cartas.clear();
        for (Carta.Naipe naipe : Carta.Naipe.values()) {
            for (Carta.Valor valor : Carta.Valor.values()) {
                cartas.add(new Carta(valor, naipe));
            }
        }
    }

    public void distribuir7CartasPara(Jogador jogador) {
        if (cartas.size() < 7) {
            throw new IllegalStateException("Não há cartas suficientes no baralho");
        }

        for (int i = 0; i < 7; i++) {
            jogador.receberCarta(cartas.remove(0));
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public List<Carta> getCartas() {
        return Collections.unmodifiableList(cartas);
    }

    public List<Carta> getDescarte() {
        return Collections.unmodifiableList(descarte);
    }

    public int cartasRestantes() {
        return cartas.size();
    }

    protected void adicionarCarta(Carta carta) {
        cartas.add(Objects.requireNonNull(carta));
    }
}
