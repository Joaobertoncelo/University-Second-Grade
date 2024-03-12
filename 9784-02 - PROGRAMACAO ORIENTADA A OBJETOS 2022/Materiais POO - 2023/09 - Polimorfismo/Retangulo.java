package aula04.polimorfismo;

public class Retangulo extends Forma {
    private double lado1, lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calculaArea(){
        return lado1*lado2;
    }
    
    public String toString() {
    	return "Retângulo";
    }

}
