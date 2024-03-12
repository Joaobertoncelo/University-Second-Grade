package aula04.polimorfismo;

public class Triangulo extends Forma{
    private double base, altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calculaArea(){
        return (base*altura)/2;
    }
    
    public String toString() {
    	return "Triangulo";
    }

}
















//public class Triangulo extends Forma{
//
//	public void desenha() {
//		System.out.println("Desenha triangulo");
//	}
//	
//}



