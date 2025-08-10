import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Carro c1 = new Carro("VW", Combustivel.Gasolina);
        Carro c2 = new Carro("GM", Combustivel.Etanol);
        Carro c3 = new Carro("Honda", Combustivel.Diesel);
        ArrayList<Carro> lc = new ArrayList<Carro>();
        lc.add(c1);
        lc.add(c2);
        lc.add(c3);
        lc.getFirst().liga();
        //lc = null;
        Onibus o1 = new Onibus("MeuOnibus");
        o1.liga();
        o1.desliga();
    }
}
/*
7. As mensagens que aparecem são do mesmo carro VW.

8. Deu um erro de Exception na driver class, mas conseguiu ligar o carro referenciado na primeira posição da lista e pelo objeto c1. Com a adição da linha lc = null, apaga-se a referência para os objetos presentes na lista, ao passo que, o objeto c1 ainda está presente em memória.

9. Os carros c1, c2 e c3 ainda existem após o comando.
        c1.liga();
        c2.liga();
        c3.liga();

10. Classe Onibus criada.

11. Para o método ligar, foi impresso o do Veículo, já para o desligar, foi impresso o do 
Veículo Terrestre. O método liga não foi implementado no objeto Onibus, então ele herda o da superclasse Veiculo. A mesma situação para o método desliga: ele não foi implementado localmente então foi herdado da classe Veiculo Terrestre.

12. A linha de String modelo da classe Onibus foi comentada e o problema foi solucionado.

13. Houve a declaração do atributo dentro da classe Carro e o método liga está presente e 
declarado na mesma classe, dessa maneira, o modelo informado e utilizado é local e, portanto, há a impressão correta do modelo do carro. Em contrapartida, o método liga não é definido na classe Onibus, então ele o herda da superclasse Veiculo, que usa o modelo de herança para o método, não o modelo local declarado.

14. Foram criados: 
    @Override
    public void liga(){
        meuMotor.liga();
        System.out.println(modelo + " ligado! (Onibus)");
    }

    @Override
    public void desliga(){
        System.out.println(modelo + " desligado! (Onibus)");
    }

15.  

*/
