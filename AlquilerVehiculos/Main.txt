package alquilervehiculos2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    char salir='s';
    int vr=0;
    
    Scanner entrar=new Scanner(System.in);
		
		Metodos m=new Metodos();
		System.out.print("BIENVENIDO A ALQUIATUOS S.A.S\n");
		
		do{   
			
			int x = 0;
			vr=m.menu(x);
		//	System.out.print("Valor: "+vr);
			salir=entrar.next().charAt(0);
			if(vr==4) { 
				salir='n';
			}
			else {
				System.out.print("Desea continaur? (s/n): ");
				salir=entrar.next().charAt(0);
			}
			
		   
		}while(salir=='s');
	}

}
