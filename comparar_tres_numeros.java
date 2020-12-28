import java.util.*;
public class comparar_tres_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Ingrese tres numeros diferentes ");
		Scanner dato=new Scanner(System.in);
		System.out.println(" Ingrese el primer numero a : ");
		int a=dato.nextInt();
		System.out.println(" Ingrese el segundo numero b : ");
		int b=dato.nextInt();
		System.out.println(" Ingrese el tercer numero c : ");
		int c=dato.nextInt();
		if(a>b&&a>c) {
			if(b>c) {
				System.out.println(" mayor : a "  + "="  + a );
				System.out.println(" intermedio : b "  + "="  + b );
				System.out.println(" menor : c "  + "="  + c );
			}else {
				System.out.println(" mayor : a "  + "="  + a );
				System.out.println(" intermedio : c "  + "="  + c );
				System.out.println(" menor : b "  + "="  + b );		
			}
		}else if(b>a&&b>c){
			if(a>c) {
				System.out.println(" mayor : b "  + "="  + b );
				System.out.println(" intermedio : a "  + "="  + a );
				System.out.println(" menor : c "  + "="  + c );
			}else {
				System.out.println(" mayor : b "  + "="  + b );
				System.out.println(" intermedio : c "  + "="  + c );
				System.out.println(" menor : a "  + "="  + a );		
			}
		}else if(c>a&&c>b){
			if(a>b) {
				System.out.println(" mayor : c "  + "="  + c );
				System.out.println(" intermedio : a "  + "="  + a );
				System.out.println(" menor : b "  + "="  + b );
			}else {
				System.out.println(" mayor : c "  + "="  + c );
				System.out.println(" intermedio : b "  + "="  + b );
				System.out.println(" menor : a "  + "="  + a );		
			}
	}
		dato.close();

}
}