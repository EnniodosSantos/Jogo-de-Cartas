import java.util.ArrayList;
import java.util.List;

public class BaralhoPaciencia extends Baralho {
    private static final Carta.Naipe[] NAIPES_PACIENTE = {Carta.Naipe.COPAS, Carta.Naipe.ESPADAS};

    public BaralhoPaciencia() {
        super(); // Chama construtor do Baralho
        inicializarBaralhoPaciencia();
        embaralhar();
    }

    private void inicializarBaralhoPaciencia() {
        List<Carta> novasCartas = new ArrayList<>();
        for (Carta.Naipe naipe : NAIPES_PACIENTE) {
            for (Carta.Valor valor : Carta.Valor.values()) {
                novasCartas.add(new Carta(valor, naipe));
            }
        }
        // Limpa e adiciona as novas cartas
        getCartas().clear();
        novasCartas.forEach(this::adicionarCarta);
    }
}