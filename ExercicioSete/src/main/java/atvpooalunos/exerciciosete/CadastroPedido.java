//Criar uma Classe para Cadastrar Pedido, com 5 atributos; Desses 5 atributos 
//pelo menos 1 deverá ser Valor; A Classe deverá conter métodos para definir 
//cada 1 dos 5 atributos;
package atvpooalunos.exerciciosete;

public class CadastroPedido {
    
    String produtoBar;
    int quantidadeBar;
    double valorBar;
    String categoriaBar;
    boolean alcoolBar;

    public CadastroPedido(String produto, int quantidade,double valor, String categoria, boolean alcool) {
        produtoBar = produto;
        quantidadeBar = quantidade;
        valorBar = valor;
        categoriaBar = categoria;
        alcoolBar = alcool;
    }
}
