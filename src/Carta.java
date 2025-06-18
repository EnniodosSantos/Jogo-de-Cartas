import java.util.Objects;

public class Carta {
    public enum Naipe {
        PAUS, OUROS, ESPADAS, COPAS
    }

    public enum Valor {
        AS("A"),
        DOIS("2"),
        TRES("3"),
        QUATRO("4"),
        CINCO("5"),
        SEIS("6"),
        SETE("7"),
        OITO("8"),
        NOVE("9"),
        DEZ("10"),
        VALETE("J"),
        DAMA("Q"),
        REI("K");

        private final String simbolo;

        Valor(String simbolo) {
            this.simbolo = simbolo;
        }

        public String getSimbolo() {
            return simbolo;
        }
    }

    private final Valor valor;
    private final Naipe naipe;

    public Carta(Valor valor, Naipe naipe) {
        this.valor = Objects.requireNonNull(valor, "Valor não pode ser nulo");
        this.naipe = Objects.requireNonNull(naipe, "Naipe não pode ser nulo");
    }

    public Valor getValor() {
        return valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }


}
