
//Driver class - ponto de entrada da execução do código.
    public class exercicio5 {
        public static void main(String[] args) {          
            Agenda ag = new Agenda();
            Contato c1 = new Contato("João", "+55 21 99999-9999");
            Contato c2 = new Contato("João", "+55 21 92222-2222");
            Contato c3 = new Contato("Maria", "+55 21 98888-8888");
            Contato c4 = new Contato("José", "+55 21 97777-7777");
            Contato c5 = new Contato("", "+55 21 91111-1111");
            Contato c6 = new Contato("Daniel", "+55 21 98989-9898");
            Contato c7 = new Contato("Daniel", "+55 21 98989-9898");
            Contato c8 = new Contato("Carol", "+55 21 97293-4093");
            ag.adicionarContato(c1);
            ag.adicionarContato(c2);
            ag.adicionarContato(c3);
            ag.adicionarContato(c4);
            ag.adicionarContato(c5);
            ag.adicionarContato(c6);
            ag.adicionarContato(c7);
            ag.listarContatos();
            String d = (ag.ehDuplicado(c1)) ? "" : " NÃO ";
            System.out.println("\nO contato " + c1.getNome() + d + " é duplicado.");
            String e = (ag.ehDuplicado(c6)) ? "" : " NÃO ";
            System.out.println("\nO contato " + c6.getNome() + e + " é duplicado.");

             //VERIFICAR ESSA FUNÇÃO EM CASA!!!!!
            if(ag.removerContato(c3)) {
                System.out.println("Contato removido com sucesso!");
            } else {
                System.out.println("Houve erro na remoção do contato!");
            }
           
            if(ag.removerContato(c4)) {
                System.out.println("Contato removido com sucesso!");
            } else {
                System.out.println("Houve erro na remoção do contato!");
            }

            if(!(ag.removerContato(c8))) {
                System.out.println("O contato não está presente na agenda!");

            }

    }
}
