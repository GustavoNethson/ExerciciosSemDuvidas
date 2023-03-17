//Criar uma Classe para Time de Futebol com no mínimo 5 atributos 1 dos 
//atributos deverá ser o jogador do time que será referência da classe jogador, 
//ou seja 1 time deverá ter pelo menos 1 jogador;

package atvpooalunos.exerciciocinco;

public class Time{
    public String nomeTime;
    public Jogador jogadorReferencia;
    public int vitoriasTemporada;
    public int derrotasTemporada;
    public String tecnicoTime;
    
    public void cadastrarTime(String nome, Jogador jogadorReferencia, int vitoriasTemporada, int derrotasTemporada, String tecnicoTime) {
        this.nomeTime = nome;
        this.jogadorReferencia = jogadorReferencia;
        this.vitoriasTemporada = vitoriasTemporada;
        this.derrotasTemporada = derrotasTemporada;
        this.tecnicoTime = tecnicoTime;
    }
    public void imprimirDadosTime(){
    System.out.println("Nome Time: " + nomeTime);
    System.out.println("Jogador Referencia: " + jogadorReferencia.getNome());
    System.out.println("Vitorias Temporada: " + vitoriasTemporada);
    System.out.println("Derrotas Temporada: " + derrotasTemporada);
    System.out.println("Tecnico Time: " + tecnicoTime);
    System.out.println("\n");
}
}