//Criar uma classe para definir Turma com no mínimo 4 atributos e 1 desses 
//atributos deverá ser referência da classe aluno;
package atvpooalunos.exercicioseis;

public class Classe {
    
     String profs;
     String coordenador;
     int qtdAluno;
     int periodo;
     Aluno aluno;
     
     public classe(Aluno Aluno){
        aluno = Aluno;
    }
     
     public void getAluno(){
         System.out.println(aluno.getNome());
     }
}
