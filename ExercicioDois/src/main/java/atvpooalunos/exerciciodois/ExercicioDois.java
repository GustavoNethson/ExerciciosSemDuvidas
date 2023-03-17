//Na Classe principal solicitar o cadastro de sintomas utilizando o método 
//construtor e solicitando o preenchimento através dos outros métodos que 
//definem os atributos;

//Na Classe principal solicitar o cadastro de 6 pacientes e cada paciente deverá
//ter no mínimo 1 sintoma cadastrado e ao selecionar o sintoma deverá validar se
//o sintoma está cadastrado;

package atvpooalunos.exerciciodois;
public class ExercicioDois {

    public static void main(String[] args){
        CadastrarPaciente pac1 = new CadastrarPaciente("joão", 26, true, 40028922, "Canadá" );
        CadastrarSintomas sint1 = new CadastrarSintomas(false, true, true, true);
        
        System.out.println(pac1.getNome());
        System.out.println(pac1.getIdade());
        System.out.println(pac1.getTrabalha());
        System.out.println(pac1.getTelefone());
        System.out.println(pac1.getBairro());
        System.out.println(sint1.getDorDeCabeca());
        System.out.println(sint1.getFebre());
        System.out.println(sint1.getMancha());
        System.out.println(sint1.getDorNoCorpo());
        
        
    }
}
