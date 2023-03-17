//Na classe Principal do Solicitar o Cadastro de 5 pedidos; 

//Na Classe Principal Retornar 1 Mensagem destacando o Total dos 5 pedidos;
package atvpooalunos.exerciciosete;

public class ExercicioSete {

    public static void main(String[] args) {
        CadastroPedido pdd1 = new CadastroPedido("Cerveja", 1, 10, "Maltada",true);
        CadastroPedido pdd2 = new CadastroPedido("Vinho", 2, 70, "Seco",true);
        CadastroPedido pdd3 = new CadastroPedido("Porção", 1, 00, "Fritas",false);
        CadastroPedido pdd4 = new CadastroPedido("Água", 1, 5, "Com gás",false);
        CadastroPedido pdd5 = new CadastroPedido("Suco", 5, 30, "Natural",false);
        
        double total = pdd1.valorBar + pdd2.valorBar + pdd3.valorBar + pdd4.valorBar +pdd5.valorBar;
        System.out.println("O total dos pedidos é: " +total);
    }
    
}
