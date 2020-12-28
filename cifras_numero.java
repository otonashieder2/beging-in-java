
import javax.swing.*;
public class cifras_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa un numero y te diremos cuantas cifras tiene "));
		if(numero>0&&numero<10) {
			System.out.println(" El numero " + numero + " tiene UNA cifra ");		
		}
		else if(numero>0&&numero<100) {
			System.out.println(" El numero " + numero + " tiene DOS cifra ");	
		}
		else if(numero>0&&numero<1000) {
			System.out.println(" El numero " + numero + " tiene TRES cifra ");
	    }
		else if(numero>0&&numero<10000) {
			System.out.println(" El numero " + numero + " tiene CUATRO cifra ");
	    }
		else if(numero>0&&numero<100000) {
			System.out.println(" El numero " + numero + " tiene CINCO cifra ");
        }else {
        	System.out.println(" El numero no es valido");
        }
    }
}