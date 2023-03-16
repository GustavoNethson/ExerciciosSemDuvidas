package braintech.exercicioum;
import java.util.Scanner;

class advogados {
    private String nomeAdvogado;
    private int idadeAdvogado;
    private String funcaoProfissional;
    private int telContato;
    private String emailContato;
    
    public advogados(String nome, int idade, String funcao, int tel, String email){
        nomeAdvogado = nome;
        idadeAdvogado = idade;    
        funcaoProfissional = funcao;
        telContato = tel;
        emailContato = email;
    }
   
    public String getNome(){
        return "Nome: " + nomeAdvogado;
    }
    public String getIdade(){
        return "Idade: " + idadeAdvogado;
    }
    public String getFuncao(){
        return "funcao" + funcaoProfissional;
    }
    public String getTel(){
        return "Telefone: " + telContato;
    }
    public String getEmail(){
        return "E-mail: " + emailContato;
    }
}

