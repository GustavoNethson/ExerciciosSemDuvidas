//Na Classe Principal solicitar o Cadastro de 5 Cervejas preenchendo todos 
//atributos;

//Na Classe Principal retornar todas as Cervejas cadastradas; 
package atvpooalunos.exercicioquatro;
import java.util.Scanner;
public class ExercicioQuatro {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Cerveja cerva1 = new Cerveja("Antartica", "Ambev", "4,7% de Alcool", "350ml", "17/03/2023", "17/07/2023");
        Cerveja cerva2 = new Cerveja("Budweiser", "Anheuser-Busch", "5% de Alcool", "350ml", "17/03/2023", "17/07/2023");
        Cerveja cerva3 = new Cerveja("Skol", "Ambev", "7% de Alcool", "350ml", "17/03/2023", "17/07/2023");
        Cerveja cerva4 = new Cerveja("Brahma", "Ambev", "8% de Alcool", "350ml", "17/03/2023", "17/07/2023");
        Cerveja cerva5 = new Cerveja("Spatem", "Ambev", "5,2% de Alcool", "350ml", "17/03/2023", "17/07/2023");
    
    
    System.out.println(cerva1.getMarca());            
    System.out.println(cerva1.getFabricante());                      
    System.out.println(cerva1.getTeorAlcoolico());            
    System.out.println(cerva1.getVolume());            
    System.out.println(cerva1.getDataFabricacao());            
    System.out.println(cerva1.getDataVencimento()); 
    System.out.println("\n");
    System.out.println(cerva2.getMarca());            
    System.out.println(cerva2.getFabricante());                      
    System.out.println(cerva2.getTeorAlcoolico());            
    System.out.println(cerva2.getVolume());            
    System.out.println(cerva2.getDataFabricacao());            
    System.out.println(cerva2.getDataVencimento());
    System.out.println("\n");
    System.out.println(cerva3.getMarca());            
    System.out.println(cerva3.getFabricante());                      
    System.out.println(cerva3.getTeorAlcoolico());            
    System.out.println(cerva3.getVolume());            
    System.out.println(cerva3.getDataFabricacao());            
    System.out.println(cerva3.getDataVencimento());
    System.out.println("\n");
    System.out.println(cerva4.getMarca());            
    System.out.println(cerva4.getFabricante());                      
    System.out.println(cerva4.getTeorAlcoolico());            
    System.out.println(cerva4.getVolume());            
    System.out.println(cerva4.getDataFabricacao());            
    System.out.println(cerva4.getDataVencimento());            
    System.out.println("\n");
    System.out.println(cerva5.getMarca());            
    System.out.println(cerva5.getFabricante());                      
    System.out.println(cerva5.getTeorAlcoolico());            
    System.out.println(cerva5.getVolume());            
    System.out.println(cerva5.getDataFabricacao());            
    System.out.println(cerva5.getDataVencimento());            
    }
}
