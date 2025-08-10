import java.util.Random;

public class FactoryCarta {
    public static Carta gerarCartaAleatoria() {
        Random random = new Random();

        Carta.Valores valor = Carta.Valores.values()[random.nextInt(Carta.Valores.values().length)];
        Carta.Naipe naipe = Carta.Naipe.values()[random.nextInt(Carta.Naipe.values().length)];

        return new Carta(naipe, valor);

    }
}
