package aula04.polimorfismo;

public class TestaForma {

	public static void main(String[] args) {
		
	 //sem polimorfismo
//	  Circulo c1 = new Circulo(5);
//	  Quadrado q1 = new Quadrado(7);
//	  Triangulo t1 = new Triangulo(5,4);
//	  Retangulo r1 = new Retangulo(2,3);
//	  
//	  System.out.println("Área do círculo : "+c1.calculaArea());
//	  System.out.println("Área do quadrado : "+q1.calculaArea());
//	  System.out.println("Área do triângulo : "+t1.calculaArea());
//	  System.out.println("Área do retângulo : "+r1.calculaArea());
	  
//      // com polimorfismo
//	  
	  Forma[] vetor = new Forma[4];
	  
      Forma f0 = new Circulo(5);
      Forma f1 = new Quadrado(7);
      Forma f2 = new Triangulo(5,4);
      Forma f3 = new Retangulo(2,3);

      vetor[0] = f0;
      vetor[1] = f1;
      vetor[2] = f2;
      vetor[3] = f3;

      System.out.println("Cálculo das áreas: ");
      for(int i=0; i< vetor.length; i++){

    	  System.out.println("Área de "+vetor[i].toString()+": "+vetor[i].calculaArea()); 
    	  
	  

    }    




		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
//    if(vetor[i] instanceof Circulo){
//    System.out.println("Forma "+i+"(Círculo): "+vetor[i].calculaArea());
//}
//else if(vetor[i] instanceof Quadrado){
//    System.out.println("Forma "+i+"(Quadrado): "+vetor[i].calculaArea());
//}
//else if(vetor[i] instanceof Triangulo){
//    System.out.println("Forma "+i+"(Triangulo): "+vetor[i].calculaArea());
//}
//else if(vetor[i] instanceof Retangulo){
//    System.out.println("Forma "+i+"(Retangulo): "+vetor[i].calculaArea());
//}

//System.out.println("Forma "+i+": "+vetor[i].calculaArea());
		
		
		
		//		Forma[] vetor = new Forma[3];
//		
//		vetor[0] = new Quadrado();
//		vetor[1] = new Circulo();
//		vetor[2] = new Triangulo();
//		
//		for(int i=0; i<vetor.length; i++) {
//			vetor[i].desenha();
//		}
		
	
	
}
}
