package aula04.polimorfismo;

public class Circulo extends Forma {
    public static double PI = 3.14159265359;
    private double raio;

    public Circulo(double raio){
        super();
        this.raio = raio;
    }

    public double calculaArea(){
        return PI*raio*raio;
    }
    
    public String toString() {
    	return "Circulo";
    }
    
}


