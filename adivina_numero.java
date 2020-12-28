import java.util.*;
public class adivina_numero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato=new Scanner(System.in);
		int aleatorio=(int)(100*Math.random());
		int num=0;
		int intentos=0;
		while(aleatorio!=num) {
			intentos++;
			System.out.println(" Introduce un numero porfavor ");
			num=dato.nextInt();
			if(aleatorio<num) {
				System.out.println(" muy alto ");
			}
			else if(aleatorio>num) {
				System.out.println(" muy bajo");	
			}	
			}
		System.out.println(" acertaste en " + intentos + " intentos ");
		dato.close();
		}
	}
