package lab5.parte3;

public class Teste {
    public static void main(String[] args) {
        Residencia casaNanda = new Residencia("Maria Fernanda", "Rua Maxwell, 581, Andaraí", "29485933", "Sala");
        casaNanda.adicionarComodo("Quarto");
        casaNanda.adicionarComodo("Banheiro");
        casaNanda.adicionarComodo("Cozinha");

        casaNanda.mostrarComodos();

        casaNanda.removerComodo("Quarto");
        System.out.printf("\n");
        casaNanda.removerComodo("Quarto");

        System.out.printf("\n");
        casaNanda.mostrarComodos();

        casaNanda.removerComodo("Banheiro");
        casaNanda.removerComodo("Sala");
        casaNanda.removerComodo("Cozinha");

        System.out.printf("\n");
        casaNanda.mostrarComodos();


    }
}