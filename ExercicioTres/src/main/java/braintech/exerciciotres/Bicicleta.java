package braintech.exerciciotres;

public class Bicicleta {
    private String marcaBicicleta;
    private String modeloBicicleta;
    private String corBicicleta;
    private int calibragemBicicleta;
    
    public Bicicleta(String marca, String modelo, String cor, int calibragem){
    marcaBicicleta = marca;
    modeloBicicleta = modelo;
    corBicicleta = cor;
    calibragemBicicleta = calibragem;
    }
    
    public String getMarca(){
        return "marca: " + marcaBicicleta;
    }
    
    public String getModelo(){
        return "Modelo: " + modeloBicicleta;
    }
    
    public String getCor(){
        return "Cor: " + corBicicleta;
    }
    
    public String getCalibragem(){
        return "Calibragem: " + calibragemBicicleta;
    }
}
