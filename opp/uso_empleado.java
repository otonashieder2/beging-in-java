package opp;
import java.util.*;

public class uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empleado[] misempleados=new empleado[4];
		
		misempleados[0]=new empleado("ana",5000,2020,06,05);
		misempleados[1]=new empleado("eder",6000,2019,07,02);
		misempleados[2]=new empleado("leonidas",7000,2018,02,11);
		misempleados[3]=new empleado("maria",8000,2017,01,12);
		
		for(empleado e:misempleados) {
			e.subesueldo(5);
		}
		
		
	}

}
class empleado{
	public empleado(String nam, double sue , int ye,int mon,int da){
		name=nam;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(ye,mon-1,da);
		fecha_contrato=calendario.getTime();
		++Idsiguiente;
		Id=Idsiguiente;
	}
	private String name;
	private double sueldo;
	private Date fecha_contrato;
	private static int Idsiguiente;
	private int Id;
	
	
	public empleado(String nom) {
		this(nom,30000,2000,01,01);
	}
	
	public String damenombre() {//GETTER
		return name + " Id " + Id;
	}

	public double dame_sueldo() {//GETTER
		return sueldo;
	}
	public Date damefechacontrato() {//GETTER
		return fecha_contrato;
	}
	public void subesueldo(double porcentaje) {//SETTER
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
		
	}	
		
	public void estableceincentivo(double b) {//SETTER
			Incentivo=b;	
		}
	public double damesueldo() {
			
			double sueldojefe=super.damesueldo();
			return sueldojefe+Incentivo;
		}
		
	private double Incentivo;
		
	}
  

	
 


