//Criar uma classe para definir Aluno com no mínimo 5 atributos com tipos de 
//dados diferentes e privados. A Classe também deverá ter um método construtor 
//para atribuir 2 atributos principais no construtor e mais 3 métodos para 
//definir os outros atributos;
package atvpooalunos.exercicioseis;

public class Aluno{

    private String nomeAluno;
    private String emailAluno;
    private int idadeAluno;
    private boolean sexoAluno;
    private double notaAluno;

    public Aluno(String nome, String email){ 
        nomeAluno = nome;
        emailAluno = email;
    }

    public String getNome() {
        return "Nome do aluno: " + nomeAluno;
    }

    public String getEmail() {
        return "E-mail: " + emailAluno;
    }

    public void getIdade() {
        return "Idade: " +idadeAluno;
    }

    public void setSexoFem(boolean asexo) {
        this.sexoFem = sexoAluno;
    }

    public void setNota(double nota) {
        this.nota = notaAluno;
    }

}
