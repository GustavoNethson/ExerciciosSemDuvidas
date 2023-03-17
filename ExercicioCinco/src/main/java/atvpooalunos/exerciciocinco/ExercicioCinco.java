//Na classe principal solicitar o Cadastro de 5 jogadores utilizando apenas a o 
//método construtor da classe Jogador;

//Na classe principal solicitar o Cadastro de 2 times utilizando apenas o método 
//construtor da classe Time e ao selecionar o jogador deverá ser validado se o 
//jogador está cadastrado;

//Retornar uma mensagem do conforme exemplo a seguir: 
//"Jogo de hoje é Time1 vs Time2" Destacando os dados dos dois times Cadatrados;
package atvpooalunos.exerciciocinco;

public class ExercicioCinco {

public class Exercicio03 extends Jogador {

    public static void main(String[] args) {
        Jogador jog1 = new Jogador();
        Jogador jog2 = new Jogador();
        Jogador jog3 = new Jogador();
        Jogador jog4 = new Jogador();
        Jogador jog5 = new Jogador();
        
        jog1.Jogador("João", "Coritiba", "Titular", 1.75, 86);
        jog2.Jogador("Gustavo", "Santos", "Reserva", 1.79, 65);
        jog3.Jogador("Lucas", "Santos", "Titular", 1.60, 106);
        jog4.Jogador("Vinicius", "Bahia", "Reserva", 1.80, 56);
        jog5.Jogador("Eduardo", "Liberta", "Titular", 1.97, 96);
    
        Time coritiba = new Time();
        Time santos = new Time();
        
        coritiba.time("Coritiba", jog1, 10, 2, "Silvio Santos");
        santos.time("Santos", jog3, 20, 5, "bernadro");
    
        System.out.println("Jogo de hoje é " + coritiba.nomeTime + " vs " + santos.nomeTime);
        coritiba.imprimirDadosTime();
        santos.imprimirDadosTime();
    }
}

