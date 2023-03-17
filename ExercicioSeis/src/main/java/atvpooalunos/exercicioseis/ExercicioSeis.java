//Na Classe principal solicitar o cadastro de 3 Alunos utilizando o método 
//construtor e solicitando o preenchimento através dos outros métodos que 
//definem os atributos;

//Na Classe principal solicitar o cadastro de 2 turmas e cada turma deverá ter 
//no mínimo 1 aluno cadastrado ao escolher o aluno deverá validar se o aluno 
//está cadastrado;
package atvpooalunos.exercicioseis;

public class ExercicioSeis {

    public static void main(String[] args) {
        
        Aluno alu1 = new Aluno("Gustavo Nethson","gustavo.nethson@edu.unipar.br");
        alu1.setIdade(18);
        alu1.setSexoFem(false);
        alu1.setNota(10);
        
        Aluno alu2 = new Aluno("João Marcos","jmcontini@edu.unipar.br");
        alu1.setIdade(97);
        alu1.setSexoFem(false);
        alu1.setNota(9);
        
        Aluno alu3 = new Aluno("Eduardo Rodruigues","dudu.edu@edu.unipar.br");
        alu1.setIdade(37);
        alu1.setSexoFem(false);
        alu1.setNota(8.8);
        
        Classe cls1 = new Classe(alu2);
        cls1.getAluno();
        
         if(alu1.getNome() != " ")
            System.out.println("O aluno está cadastrado.");
        
        Classe cls2 = new Classe(alu1);
        cls2.getAluno();
        
         if(alu1.getNome() != " ")
            System.out.println("O aluno está cadastrado.");
    
    }
}
