public class Agenda {
    private Contato[] meusContatos;
    private final int MAX = 100;
    private int total = 0;
    //Construtor:
    public Agenda(){
    meusContatos = new Contato[MAX];
    }
    public boolean ehDuplicado(Contato c) {
    for (int i = 0; i < total; ++i) {
        if (c.equals(meusContatos[i])) { //Chama o nosso "equals()"!
        return true;
        }
    }
    return false;
    }

    public void listarContatos(){
        for (int i = 0; i < total; ++i) {
        System.out.println(meusContatos[i].getNome());
    }
    System.out.println("Total de " + total + " contatos listados.");
    }
    public boolean adicionarContato(Contato c){
        if(total == MAX) //Agenda lotada?
            return false;
        boolean adicionar = true;
        for(int i = 0; i < total; i++) {
            if(c.equals(meusContatos[i])) adicionar = false;
    }
        if(adicionar) {
            meusContatos[total] = c;
            ++total;
        } else {
            System.out.println("O contato com nome " + c.getNome() + " informado já existe na agenda de contatos!");
    }

        return true;
    }

    public boolean removerContato(Contato c){
        for(int i = 0; i < total; i++) {
            //Comparação por referência!!
            if(c == meusContatos[i]) {
                for(int j = i; j < total - 1; j++) {
                    meusContatos[j] = meusContatos[j+1];
                }
                total--;
                return true;
        }
    }
        return false;
    }

} 
