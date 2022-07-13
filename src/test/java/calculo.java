import java.util.Scanner;

public class calculo {

	public static void main(String[] args) {
		
       Operacoes o = new Operacoes();
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite o 1 valor:");	
	int v1 = scanner.nextInt();
	System.out.println("Digite o 2 valor:");
	int v2 = scanner.nextInt();
	   	
	
      o.soma(v1, v2);
	
      
   System.out.println("vamos iniciar a operacoes de dividir");
   
   System.out.println("Digite o 1 valor:");
   int v3 = scanner.nextInt(); 
   System.out.println("Digite o 2 valor:"); 
   int v4 = scanner.nextInt();
   
      o.dividir(v3, v4);
   
   
   
System.out.println("vamos iniciar a operacoes de multiplicacao");
   
   System.out.println("Digite o 1 valor:");
   int v5 = scanner.nextInt(); 
   System.out.println("Digite o 2 valor:"); 
   int v6 = scanner.nextInt();
   
     o.multiplicacao(v5, v6);
   
   
System.out.println("vamos iniciar a operacoes de subtracao");
   
   System.out.println("Digite o 1 valor:");
   int v7 = scanner.nextInt(); 
   System.out.println("Digite o 2 valor:"); 
   int v8 = scanner.nextInt();
     o.subtracao(v7, v8);
   
   
   
   
   
   
	o.soma(5,80);                                
    o.dividir(80,10);
	o.multiplicacao(150,6);
	o.subtracao(90,60);
	}
       
}
