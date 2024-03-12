package aula04.polimorfismo;

public class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double calculaArea(){
        return lado*lado;
    }
    
    public String toString() {
    	return "Quadrado";
    }
}













//public class Quadrado extends Forma{
//	
//	public void desenha() {
//		System.out.println("Desenha quadrado");
//	}
//
//}
