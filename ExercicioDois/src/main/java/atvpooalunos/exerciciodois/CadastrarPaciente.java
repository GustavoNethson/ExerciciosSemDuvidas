//Criar uma classe para Cadastrar Paciente com no mínimo 5 atributos com tipos 
//de dados diferentes, privados 1 desses atributos deverá ser referência da 
//Classe Sintomas. A Classe também deverá ter um método construtor para atribuir
//4 atributos principais no construtor e mais 1 método para definir os outros 
//que se referencia ao sintoma do paciente;
package atvpooalunos.exerciciodois;

public class CadastrarPaciente {
   public String nomePaciente;
   public int idadePaciente;
   public boolean trabalhaPaciente;
   public int telefonePaciente;
   private String bairroPaciente; 
   
   public CadastrarPaciente(String nome, int idade, boolean trabalha, int telefone, String bairro){
       nomePaciente = nome;
       idadePaciente = idade;
       trabalhaPaciente = trabalha;
       telefonePaciente = telefone;
       bairroPaciente = bairro;
   }
   
   public String getNome(){
    return "Nome: " +nomePaciente;
}
   public String getIdade(){
       return "Idade: " +idadePaciente;
   }
   public String getTrabalha(){
       return "Trabalha: " +trabalhaPaciente;
   }
   public String getTelefone(){
       return "Telefone: " +telefonePaciente;
   }
   public String getBairro(){
       return "Bairro: " +bairroPaciente;
   }
}
