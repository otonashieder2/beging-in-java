package opp;

public class uso_vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		coche micoche1=new coche();
		micoche1.establece_color("rojo");
		Furgoneta mifurgoneta1=new Furgoneta(500,7);
		mifurgoneta1.establece_color("azul");
		mifurgoneta1.configura_asientos("si");
		mifurgoneta1.configura_climatizador("si");
		System.out.println(micoche1.damedatosgenerales());
		System.out.println(mifurgoneta1.damedatosgenerales() + mifurgoneta1.dameDatosFurgoneta());
		
		
	}

}
