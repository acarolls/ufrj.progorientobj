public class Carta implements Printavel {
    //Atributo do tipo enum correspondente ao número da carta
    public Valores numero;
    //Atributo do tipo Naipe
    public Naipe np;

    //Metodo construtor
    public Carta(Naipe n, Valores num) {
        this.numero = num;
        this.np = n;         
    }

    //Inner Class Naipe
    public enum Naipe {
        OUROS, ESPADAS, PAUS, COPAS;
    } 
    public enum Valores {
        AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, VALETE, DAMA, REI;
    }
    
    //Implementação do método da interface
    @Override
    public String imprimir() {
        return this.numero + " de " + this.np + ".";
    }
}
