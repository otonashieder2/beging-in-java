import java.util.Scanner;

public class usar_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato=new Scanner(System.in);
		int aleatorio=(int)(100*Math.random());
		int num=0;
		int intentos=0;
		do{
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
		while(aleatorio!=num);
		System.out.println(" acertaste en " + intentos + " intentos ");
		
		dato.close();

	}

}
