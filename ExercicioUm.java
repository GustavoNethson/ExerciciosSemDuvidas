//Criar um projeto para Cadastrar Advogados. 
//Criar uma Classe Advogado com 2 Atributos Públicos e 5 Atributos Privados; 
//A Classe deverá conter um construtor preenchendo os 2 atributos públicos e 
//1 Método para preencher cada atributo privado; A Classe também deverá conter 
//1 método para retornar o valor preenchido de cada atributo privado;

//Na Classe Principal solicitar o Cadastro de 8 Advogados preenchendo 
//os Atributos Públicos diretamente e caso o atributo público não for preenchido
//deverá ser validado solicitando para o Atributo ser cadastrado; Solicitar o preenchimento
//dos outros atributos através do método definido na Classe Advogado;

//Na Classe Principal retornar os 3 Últimos Advogados Cadastrados; 
//1 Por linha; porém em cada linha concatenar todos os atributos do Advogado;

package braintech.exercicioum;
public class ExercicioUm {

    public static void main(String[] args) {
       advogados adv1 = new advogados("Leonardo Pereira", 48, "Criminal", 40028922, "leandropereira@pereira.com");         
       advogados adv2 = new advogados("Edinaldo Pereira", 56, "Civil", 40028922, "ednaldopereira@pereira.com");
       advogados adv3 = new advogados("Maycon Diekson", 38, "Pequenas Causas", 40028922, "maycondiekson@pereira.com");
       advogados adv4 = new advogados("João Barcos", 40, "Criminal", 40028922, "joaobarcos@pereira.com");
       advogados adv5 = new advogados("Donald Duck", 51, "Trabalhista", 40028922, "duckdonald@pereira.com");
       advogados adv6 = new advogados("Pedro Black", 52, "Criminal", 40028922, "pedroblack@pereira.com");
       advogados adv7 = new advogados("Adão Black", 36, "Pequenas Causas", 40028922, "blackadao@pereira.com");
       advogados adv8 = new advogados("Juliana Amaral", 46, "Trabalhista", 40028922, "juliama@pereira.com");
                
       System.out.println("=-----=-----=LISTA DE ADVOGADOS=-----=-----=");
       System.out.println(adv1.getNome());
       System.out.println(adv1.getIdade());
       System.out.println(adv1.getFuncao());
       System.out.println(adv1.getTel());
       System.out.println(adv1.getEmail());
       System.out.println("=-----=-----=-----=-----=-----=-----=-----=");
       
       System.out.println(adv2.getNome());
       System.out.println(adv2.getIdade());
       System.out.println(adv2.getFuncao());
       System.out.println(adv2.getTel());
       System.out.println(adv2.getEmail());
       System.out.println("=-----=-----=-----=-----=-----=-----=-----=");
      
       System.out.println(adv3.getNome());
       System.out.println(adv3.getIdade());
       System.out.println(adv3.getFuncao());
       System.out.println(adv3.getTel());
       System.out.println(adv3.getEmail());
       System.out.println("=-----=-----=-----=-----=-----=-----=-----=");
       
       System.out.println(adv4.getNome());
       System.out.println(adv4.getIdade());
       System.out.println(adv4.getFuncao());
       System.out.println(adv4.getTel());
       System.out.println(adv4.getEmail());
       System.out.println("=-----=-----=-----=-----=-----=-----=-----=");
       
       System.out.println(adv5.getNome());
       System.out.println(adv5.getIdade());
       System.out.println(adv5.getFuncao());
       System.out.println(adv5.getTel());
       System.out.println(adv5.getEmail());
       System.out.println("=-----=-----=-----=-----=-----=-----=-----=");
       
       System.out.println(adv6.getNome());
       System.out.println(adv6.getIdade());
       System.out.println(adv6.getFuncao());
       System.out.println(adv6.getTel());
       System.out.println(adv6.getEmail());
       System.out.println("=-----=-----=-----=-----=-----=-----=-----=");
       
       System.out.println(adv7.getNome());
       System.out.println(adv7.getIdade());
       System.out.println(adv7.getFuncao());
       System.out.println(adv7.getTel());
       System.out.println(adv7.getEmail());
       System.out.println("=-----=-----=-----=-----=-----=-----=-----=");
       
       System.out.println(adv8.getNome());
       System.out.println(adv8.getIdade());
       System.out.println(adv8.getFuncao());
       System.out.println(adv8.getTel());
       System.out.println(adv8.getEmail());
       System.out.println("=-----=-----=-----=-----=-----=-----=-----=");
       
       System.out.println("" + adv6.getNome() + ", " + adv6.getIdade() + ", " + adv6.getFuncao() + ", " + adv6.getTel() + ", " + adv6.getEmail());
       
       System.out.println("" + adv7.getNome() + ", " + adv7.getIdade() + ", " + adv7.getFuncao() + ", " + adv7.getTel() + ", " + adv7.getEmail());
       
       System.out.println("" + adv8.getNome() + ", " + adv8.getIdade() + ", " + adv8.getFuncao() + ", " + adv8.getTel() + ", " + adv8.getEmail());
       
    }
}
