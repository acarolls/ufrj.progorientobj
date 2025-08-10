import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<Carta>();
        Pontuacao pontuacao = Pontuacao.getPontuacao();
        
        // Gerar 5 cartas aleatórias e adicioná-las à mão do jogador
        for(int i = 0; i < 5; i++) {
            cartas.add(FactoryCarta.gerarCartaAleatoria());
        }
        
        // Imprimir as cartas
        for(Carta carta : cartas) {
            System.out.println(carta.imprimir());  // Imprime a representação da carta
        }

        for(Carta carta : cartas) {
            //Cada carta, nesse exemplo, está valendo 1 ponto!
            pontuacao.ganhaPontos(1);
            System.out.println("Pontos acumulados: " + pontuacao.verPontos());
        }

        pontuacao.ganhaPontos(5);
        System.out.println("Pontos após adicionar 5: " + pontuacao.verPontos());
        
        //Pontuacao p = new Pontuacao();
    }
}
/*
O código nao compila com a nova linha Pontuacao p = new Pontuacao(), visto que o método
construtor não está visível.
*/