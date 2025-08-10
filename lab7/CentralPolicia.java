public class CentralPolicia implements Observer {
    private boolean status;

    @Override 
    public void atualizar(boolean s) {
        this.status = s;
        if(status) {
            System.out.println("Atualização de status: há movimentação suspeita em casa.");
        } else
            System.out.println("Atualização de status: não há ninguém em casa.");
    }
}
