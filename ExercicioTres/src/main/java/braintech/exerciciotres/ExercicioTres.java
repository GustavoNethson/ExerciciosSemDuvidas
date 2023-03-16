//Criar um projeto para Cadastrar Bicicletas.

//Criar uma Classe Bicicleta com 3 Atributos públicos e 4 Atributos privados;
//criar 2 métodos para cadastrar os atributos privados; Criar um construtor para atribuir 2 atributos; 

//Na Classes principal Cadastrar no mínimo 4 Bicicletas;

//Na Classe principal Mostrar 4 Mensagens destacando os 
//7 atributos das 2 primeiras bicicletas cadastradas;

package braintech.exerciciotres;
public class ExercicioTres {

    public static void main(String[] args) {
     
        Bicicleta bk1 = new Bicicleta ("OGGI", "Hacker", "Preto", 28 );
        Bicicleta bk2 = new Bicicleta ("Caloi", "Cross", "Rosa", 28 );
        Bicicleta bk3 = new Bicicleta ("Caloi", "Cross", "Amarelo", 28 );
        Bicicleta bk4 = new Bicicleta ("OGGI", "Hacker", "vermelho", 28 );
    
    
    System.out.println("|----------|----------|----------|----------|");
    System.out.println(bk1.getMarca());
    System.out.println(bk1.getModelo());
    System.out.println(bk1.getCor());
    System.out.println(bk1.getCalibragem());
    System.out.println("|-------------------------------------------|");
    
    System.out.println(bk2.getMarca());
    System.out.println(bk2.getModelo());
    System.out.println(bk2.getCor());
    System.out.println(bk2.getCalibragem());
    System.out.println("|-------------------------------------------|");
    
    System.out.println(bk3.getMarca());
    System.out.println(bk3.getModelo());
    System.out.println(bk3.getCor());
    System.out.println(bk3.getCalibragem());
    System.out.println("|-------------------------------------------|");
    
    System.out.println(bk4.getMarca());
    System.out.println(bk4.getModelo());
    System.out.println(bk4.getCor());
    System.out.println(bk4.getCalibragem());
    System.out.println("|-------------------------------------------|");
    
    
   } 
}
