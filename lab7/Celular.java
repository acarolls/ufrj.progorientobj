public class Celular implements Observer{
    private boolean status;
        
    public boolean consultaPresencaDono(Casa c) {
        return c.getDonoEmCasa();
    }

    public void alteraPresencaDono(Casa c, boolean p) {
        c.setDonoEmCasa(p);
    }

    @Override
    public void atualizar(boolean s) {
        this.status = s;
        if(status) {
            System.out.println("Celular: há movimentação suspeita em casa.");
        } else
            System.out.println("Celular: não há ninguém em casa.");
    }
}
