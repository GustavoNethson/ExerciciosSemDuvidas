//Criar uma Classe Cerveja com 4 Atributos Públicos e 2 Atributos Privados; A 
//Classe deverá conter um construtor preenchendo 1 atributo privado e o outro 
//atributo privado deverá ser chamado de Código e esse deverá ser incremental; 
//Deverá conter 1 Método para preencher cada atributo público; A Classe também 
//deverá conter 1 método para retornar o valor do atributo Código;

package atvpooalunos.exercicioquatro;
public class Cerveja {
    private String marcaCerveja;
    private String fabricanteCerveja;
    public String teorAlcoolicoCerveja;
    public String volumeRecipienteCerveja;
    public String dataDeFabricacaoCerveja;
    public String dataDeVencimentoCerveja;

    public Cerveja(String marca, String fabricante, String teorAlcoolico, String volume, String dataFabricacao, String dataVencimento){
        marcaCerveja = marca;
        fabricanteCerveja = fabricante;
        teorAlcoolicoCerveja = teorAlcoolico;
        volumeRecipienteCerveja = volume;
        dataDeFabricacaoCerveja = dataFabricacao;
        dataDeVencimentoCerveja = dataVencimento;
    }
    
    public String getMarca(){
        return "Marca: " +marcaCerveja;
    }
    public String getFabricante(){
        return "Marca: " +fabricanteCerveja;
    }
    public String getTeorAlcoolico(){
        return "Marca: " +teorAlcoolicoCerveja;
    }
    public String getVolume(){
        return "Marca: " +volumeRecipienteCerveja;
    }
    public String getDataFabricacao(){
        return "Marca: " +dataDeFabricacaoCerveja;
    }
    public String getDataVencimento(){
        return "Marca: " +dataDeVencimentoCerveja;
    }
}