// Mensagem indicando a autoria do código
System.out.println("Autor: Arthur Duarte Alves Cruz, Cruso: Analise e desenvolvimemtp de sistemas, Matrícula: 202213336 ");

// Criação da nova classe PersonagemFadinha
class PersonagemFadinha extends Personagem {
    // A linha abaixo define um novo atributo para a classe PersonagemFadinha
int poderMagico;

// A linha abaixo define o construtor da classe PersonagemFadinha com os parâmetros ID, nome, nivel e poderMagico
public PersonagemFadinha(int ID, String nome, int nivel, int poderMagico) {
    // A linha abaixo chama o construtor da classe mãe Personagem e passa o ID como parâmetro
    super(ID);
    // A linha abaixo define o tipo da PersonagemFadinha como "fada"
    this.tipo = "fada";
    // A linha abaixo define o nome da PersonagemFadinha com base no parâmetro passado
    this.nome = nome;
    // A linha abaixo define o nível da PersonagemFadinha com base no parâmetro passado
    this.nivel = nivel;
    // A linha abaixo define o poder mágico da PersonagemFadinha com base no parâmetro passado
    this.poderMagico = poderMagico;
}

// A linha abaixo define um método específico da PersonagemFadinha para lançar magia
public void lancarMagia() {
    // A linha abaixo printa  uma mensagem com o nome da PersonagemFadinha que lançou a magia
    System.out.println("A fada " + this.nome + " lançou sua potente magia");
}

class Personagem {

   // Declaração dos atributos da classe Personagem, que são nome, tipo, nivel e id
    String nome;
    String tipo;
    int nivel;
    protected int id; // id é um atributo protegido, que pode ser acessado pelas subclasses da classe Personagem

    // Construtor da classe Personagem, que recebe um ID como parâmetro e inicializa os atributos com valores padrão
    public Personagem(int ID) {
        this.id = ID;
        this.nome = "indefinido";
        this.tipo = "indefinido";
        this.nivel = 0;
    }

    // Método imprimeDados() imprime as informações do personagem, como tipo, id, nome e nivel
    public void imprimeDados() {
        System.out.println("Personagem do tipo " + this.tipo + " com ID = " + this.id);
        System.out.println("Possui nível " + this.nivel + " e se chama " + this.nome);
    }
}

class Dragao extends Personagem {
    // Declaração das variáveis específicas da classe Dragao
    int peso;
    int atividade;
    boolean ocupado;

    // Construtor que recebe apenas o ID como parâmetro e inicializa as variáveis
    public Dragao(int ID) {
        // Chama o construtor da classe pai (Personagem) passando o ID como parâmetro
        super(ID);
        // Define o tipo como "dragão" e o nome como "indefinido"
        this.tipo = "dragão";
        this.nome = "indefinido";
        // Inicializa as outras variáveis com valores padrão
        this.atividade = 0;
        this.ocupado = false;
    }

    // Construtor que recebe o ID e o nome como parâmetros e inicializa as variáveis
    public Dragao(int ID, String nome) {
        // Chama o construtor da classe pai (Personagem) passando o ID como parâmetro
        super(ID);
        // Define o tipo como "dragão" e o nome como o nome passado como parâmetro
        this.tipo = "dragão";
        this.nome = nome;
        // Inicializa as outras variáveis com valores padrão
        this.atividade = 0;
        this.ocupado = false;
    }

    // Método que recebe um código de atividade e exibe uma mensagem com o nome do dragão e o código da atividade
    public void atuar(int codigo) {
        // Chama o método imprimeDados() da classe pai (Personagem) para imprimir informações gerais do dragão
        this.imprimeDados();
        // Exibe uma mensagem informando que o dragão vai executar uma atividade do tipo do código passado como parâmetro
        System.out.println("Vai executar uma atividade do tipo " + codigo);
    }
}


public class Main {
    public static void main(String[] args) {
        // Criação de uma instância da classe Personagem com ID 1
        Personagem p = new Personagem(1);

        // Impressão dos dados da instância criada
        p.imprimeDados();

        // Criação de uma instância da classe Dragao com ID 2 e nome Leviatã
        Dragao d1 = new Dragao(2, "Hades");

        // Invocação do método atuar na instância criada
        d1.atuar(0);

        // Criação da instância de PersonagemFadinha com base na matrícula do aluno
        int matricula = 202213336;
        PersonagemFadinha fada1 = new PersonagemFadinha(matricula, "Jasmine", 5, 50);

        // Invocação do método lancarMagia() na instância criada
        fada1.lancarMagia();
    }
}