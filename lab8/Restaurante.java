public class Restaurante implements Conveniado, lazyObserver{
    private final String CNPJ;
    private final String nome;

    public Restaurante(String CNPJ, String nome){
        this.CNPJ = CNPJ;
        this.nome = nome;
    }

    @Override
    public void atualizar(double desconto) {
        System.out.println("Restaurante " + nome + " aplicou desconto de: " + desconto);
    }
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void solicitarAtualizacao(Emissor emissor) {
        emissor.notificarObservador(this);
    }
}
