public class vigilancia {
    public static void main(String[] args) {
        Casa c = new Casa("Rua do Ronald, 41");
        CentralVigilancia central = new CentralVigilancia(c);

        CentralPolicia centralPolicia = new CentralPolicia();
        central.setCentralPolicia(centralPolicia);

        Celular celular1 = new Celular();
        Celular celular2 = new Celular();
        central.addCelular(celular1);
        central.addCelular(celular2);
        
        central.vigiar();
    }

}