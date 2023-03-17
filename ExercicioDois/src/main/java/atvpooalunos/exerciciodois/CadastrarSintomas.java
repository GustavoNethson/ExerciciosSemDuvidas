//Criar uma classe para Cadastrar Sintoma com no mínimo 4 atributos com tipos de
//dados diferentes e públicos. A Classe também deverá ter um método construtor 
//para atribuir os 4 atributos no construtor e pelo menos 1 método para retornar
//o valor dos atributos;

package atvpooalunos.exerciciodois;

public class CadastrarSintomas {
    public boolean dorDeCabecaSintomas;
    public boolean febreSintomas;
    public boolean manchasNoCorpoSintomas;
    public boolean dorNoCorpoSintomas;
    
    public CadastrarSintomas(boolean dorDeCabeca, boolean febre, boolean mancha, boolean dorNoCorpo){
        dorDeCabecaSintomas = dorDeCabeca;
        febreSintomas = febre;
        manchasNoCorpoSintomas = mancha;
        dorNoCorpoSintomas = dorNoCorpo;
    }
    public String getDorDeCabeca(){
        return " Sente dor de cabeça: " +dorDeCabecaSintomas;
    }
    public String getFebre(){
        return "Tem Febre: " +febreSintomas;
    }
    public String getMancha(){
        return "Tem manchas no corpo: " +manchasNoCorpoSintomas;
    }
    public String getDorNoCorpo(){
        return "Sente dor no corpo; " +dorNoCorpoSintomas;
    }
    
    
}
