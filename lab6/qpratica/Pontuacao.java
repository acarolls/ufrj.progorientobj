//Nessa classe é utilizado o conceito de Singleton!

public class Pontuacao {
    private static Pontuacao instance;
    private int pontos = 0;

    private Pontuacao() {
        //método construtor privado
    }

    public static Pontuacao getPontuacao() {
        if(instance == null)
            instance = new Pontuacao();
        return instance;
    }

    public void ganhaPontos(int valor) {
       pontos += valor;
    }

    public int verPontos() {
        return pontos;
    }
}
