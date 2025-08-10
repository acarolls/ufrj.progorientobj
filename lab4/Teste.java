package lab4;

public class Teste {
    public static void main(String[] args) {
        Gerente jose = new Gerente("José", 2222, 10500.00, null);
        Funcionario eugenio = new Funcionario("Eugênio", 9999, 500.00, jose);
        
        Trimestre t = Trimestre._3o;

        System.out.println("\nBônus de " + jose.getNome() + " no " + t + " trimestre:");
        System.out.println(jose.bonus(t));
        System.out.println("\nBônus de " + eugenio.getNome() + " no " + t + " trimestre:" );
        System.out.println(eugenio.bonus(t));

    }
}
/*
1. 
Shallow Copy (Cópia Superficial)
Descrição: Cria uma nova instância do objeto, mas não copia os objetos que estão dentro 
dele. Em vez disso, copia as referências para esses objetos. Isso significa que tanto o
 objeto original quanto a cópia superficial referenciam os mesmos objetos internos.

 Deep Copy (Cópia Profunda)
Descrição: Cria uma nova instância do objeto e também copia todos os objetos internos 
recursivamente. Assim, o objeto copiado é totalmente independente do objeto original.

2. Herança é um dos conceitos fundamentais da programação orientada a objetos (POO) 
e em Java, ela permite que você crie uma nova classe com base em uma classe existente. 
Isso ajuda a promover a reutilização de código e a criar uma hierarquia de classes que
pode compartilhar comportamentos comuns. Superclasse/Classe-mãe Subclasse/Classe-filha

3. Na herança simples uma subclasse só herda de apenas uma classe, já na herança múltipla
uma classe-filha é herdada de mais de uma superclasse. Em java, só existem heranças simples.

4. Polimorfismo é um conceito fundamental na programação orientada a objetos (POO) que 
permite que objetos de diferentes classes sejam tratados de maneira uniforme através 
de uma interface comum. O termo "polimorfismo" vem do grego e significa "muitas formas".
Em Java, o polimorfismo permite que você use uma única interface para diferentes tipos
de objetos e seus comportamentos, mesmo que esses objetos sejam de classes diferentes.

Polimorfismo de Sobrescrita (Override)
Descrição: Ocorre quando uma subclasse fornece uma implementação específica de um método
que já está definido na sua superclasse. A implementação da subclasse substitui a 
implementação da superclasse quando o método é chamado.

Polimorfismo de Sobrecarga (Overload)
Descrição: Ocorre quando você tem múltiplos métodos com o mesmo nome, mas com diferentes
parâmetros (tipos ou número de parâmetros) na mesma classe.

5. Será escrito False. Utilizar obj1.valor.equals(obj2) solucionaria o problema ou a sobrescrita
do metodo equals():

@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return false;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Exercicio exercicio = (Exercicio) obj;
        return valor != null ? valor.equals(exercicio.valor) : exercicio.valor == null;
    }
6. O bonus de José foi de 15%. O de Eugenio foi de 10%. 

7. O método super em Java é usado para se referir à classe-mãe (ou superclasse) de uma 
classe derivada (subclasse). Ele permite acessar membros da superclasse, como métodos 
ou variáveis, e também invocar construtores da classe-mãe.
O super vai refenciar o método construtor da classe-mãe funcionário. Na prática, a criação
de um gerente necessita que o gerente seja um funcionário também, logo, ele possuira todas
as atribuições e métodos de Funcionario.

8. Na linha return (t == Trimestre._4o) ? salario * 0.15 : bonus(t);, sendo o 3 trimestre, 
o código irá se autorrerefenciar e continua chamadas infinitas para o código sem retorno de 
nenhum valor, o que causa um stack overflow. Por isso o erro de execução.

9. Feita a mudança na hora da invocação do método bonus caso nao seja o quarto trimestre.

This() é uma chamada ao construtor da mesma classe. Ele é usado para invocar um 
construtor de sobrecarga dentro de outro construtor da mesma classe. Essa chamada deve 
ser a primeira instrução no construtor.

10. O método, que está na classe-mãe, necessita de um parâmetro para ser utilizado, logo o
código não compila. O código compila normalmente porque ele vai utilizar o método bonus() (sem parâmetros)
presente na classe Gerente.

11. Método implementado na classe Funcionário

 @Override
    public boolean equals(Object obj) {
        // Verifica se o objeto é o mesmo
        if (this == obj) return false;

        // Verifica se o objeto é uma instância da classe Funcionario
        if (obj == null || getClass() != obj.getClass()) return false;

        // Faz o cast do objeto para Funcionario
        Funcionario outro = (Funcionario) obj;

        // Compara as matriculas
        return matricula == outro.matricula;
    }


12. Não, o código não compila normalmente. Uma vez que os atributos colocados em privado
são necessários para realizar o método bonus(), ele não consegue acessar e, consequentemente,
avisa erro de compilação.

13. Implementei o getSalario na classe Funcionario e a utilizei na classe-filha Gerente.

 */