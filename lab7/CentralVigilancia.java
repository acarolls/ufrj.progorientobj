import java.util.ArrayList;

public class CentralVigilancia {
    private ArrayList<Observer> celulares = new ArrayList<>();
    private CentralPolicia cp;
    private Casa c;
    private boolean status;

    public CentralVigilancia(Casa c) {
        this.c = c;
    }

    public boolean vigiar() {
        boolean algoSuspeito = false;
        for(int i=0; i < 10; i++) {
            if(c.movimentacao() && !c.getDonoEmCasa()) {
                algoSuspeito = true;
                System.out.println("Tem gente em casa.");
        } else 
                System.out.println("Ninguem em casa.");
    }
    return algoSuspeito;
    }

    public void addCelular(Celular cel) {
        celulares.add(cel);
    }

    public void removerCelular(Celular cel) {
        celulares.remove(cel);
    }

    public void notificar() {
        for(Observer cel : celulares) {
            cel.atualizar(status);
        }
        cp.atualizar(status);
    }
    
    public void setCentralPolicia(CentralPolicia c) {
        this.cp = c;
    }

    public void removerCentralPolicia(CentralPolicia c) {
        this.cp = null;
    }

    public void setStatus(boolean s) {
        this.status = s;
        notificar();
    }
}