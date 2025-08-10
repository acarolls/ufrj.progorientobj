package lab10;
import java.util.ArrayList;
public class q7 {
    public static void main(String[] args) {
        ArrayList<Pessoa> grupo = new ArrayList<Pessoa>();
        Pessoa r = new Pessoa("Ronald");
        Pessoa a = new Pessoa("Ana");
        Pessoa alguem = r;

        grupo.add(new Pessoa("Jose"));
        grupo.add(r);
        grupo.add(alguem);
        grupo.add(a);
        r = null;
        grupo.set(2, null);
        System.out.println("Grupo atual:");
        for (Pessoa p : grupo) {
            if(p == null)
                System.out.println("null ");

            else
                System.out.println(p.getNome());
        }
        grupo = null; //Quantos objetos e quantas variáveis ainda existirão aqui? //(... mais código...)
    }
}

/*
b. O código foi exibido com Ronald duas vezes, uma vez que ainda há a referência
para o objeto na memória .
c. Achei que ia continuar aparecendo Ronald, mas veio null. Uma vez que ainda estamos
printando itens da lista, e o próprio item da lista foi para null, temos que ele imprimirá null.

d. Acredito que existirão 2 objetos ainda (Ana e Ronald), uma vez que ainda possuem referencias
para ele. Já José ficará para o Garbage collector, uma vez que a unica referencia para ele
era o arraylist grupo.
 */