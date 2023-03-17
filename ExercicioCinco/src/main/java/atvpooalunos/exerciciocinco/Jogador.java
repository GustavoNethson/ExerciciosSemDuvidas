//Criar uma classe para definir Jogador com no mínimo 5 atributos privados e no 
//mínimo 3 métodos e além dos 3 um método construtor para Cadastrar os 5 
//atributos que não podem ficar acessível fora da classe; 

package atvpooalunos.exerciciocinco;

public class Jogador{

    private String nomeJogador;
    private String timeJogador;
    private String titularReserva;
    private double alturaJogador;
    private double pesoJogador;

    public void removerJogador(String nome, String time, String titularReserva, double altura, double peso) {
        this.nomeJogador = null;
        this.timeJogador = null;
        this.titularReserva = null;
        this.alturaJogador = 0;
        this.pesoJogador = 0;
    }

    public void editarJogador(String nome, String time, String titularReserva, double altura, double peso) {
        this.nomeJogador = nome;
        this.timeJogador = time;
        this.titularReserva = titularReserva;
        this.alturaJogador = altura;
        this.pesoJogador = peso;
    }

    public void imprimirDados() {
        System.out.println("nome: " + nomeJogador);
        System.out.println("time: " + timeJogador);
        System.out.println("titularReserva: " + titularReserva);
        System.out.println("altura: " + alturaJogador);
        System.out.println("peso: " + pesoJogador);
        System.out.println("\n");
    }

    public void construtorJogador(String nome, String time, String titularReserva, double altura, double peso) {
        this.nomeJogador = nome;
        this.timeJogador = time;
        this.titularReserva = titularReserva;
        this.alturaJogador = altura;
        this.pesoJogador = peso;
    }
    public String getNome() {
        return nomeJogador;
    }

}
