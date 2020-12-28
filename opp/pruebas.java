package opp;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empleados empleado1=new empleados(" Ana Gomez ");
		empleados empleado2=new empleados("Eder Gomez");
		empleados empleado3=new empleados("Leonidas Gomez");
		empleados empleado4=new empleados("Maria Gomez");
		
		empleado1.cambiaseccion("Finanzas");
		System.out.println(empleado1.damedatos());
		System.out.println(empleado2.damedatos());
		System.out.println(empleado3.damedatos());
		System.out.println(empleado4.damedatos());
		
			
	}

}
 class empleados{
	 public empleados(String nom){
		 nombre=nom;
		 seccion="Administracion";
		 Id=Idsiguiente;
		 Idsiguiente++;
		 
	 }
	 public void cambiaseccion(String seccion) {//SETTER
		 this.seccion=seccion;
	 }
	 public String damedatos() {//GETTER
		 return " El nombre es : " + nombre + " y la seccion es : " + seccion + " Id :" +Id;
	 }
	 
	 private final String nombre;
	 private String seccion; 
	 private int Id;
	 public static int Idsiguiente=1;
	
}
