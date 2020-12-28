package opp;

public class coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	
	private boolean asientos_cuero,climatizador;
	
	
	public coche() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1000;
		peso_plataforma=500;
	}
	public String damedatosgenerales() {
		return " el peso de plataforma es : " + peso_plataforma + " tiene : " + ruedas + " ruedas " ;
	}
	
	
	
	
	
	
	
	
	
	public String dime_ruedas()			 {//GETTER
		return " Tu coche tiene " + ruedas + " ruedas ";
	}
	public String dime_largo() {//GETTER
		return " Tu coche tiene " + largo + " milimetros de largo ";
	}
	public String dime_ancho() {//GETTER
		return " El ancho de tu coche es " + ancho + " centimetros ";
	}
	public String dime_motor() {//GETTER
		return " El motor de tu coche es de " + motor + "cc";
	}
	public String dime_peso_plataforma() {//GETTER
		return " El peso de la plataforma de tu coche es " + peso_plataforma +" Kilogramos ";
	}
	public void establece_color(String color_coche) {//SETTER
		color=color_coche;
	}
	public String dime_color() {//GETTER
		return " El color del coche es " + color;}
	
	public void configura_asientos(String asientos_cuero) {//SETTER
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
	public String dime_asientos() {//GETTER
		if(asientos_cuero==true) {
			return " El coche tiene asientos de cuero ";
		}else {
			return " El coche tiene asientos de serie ";
		}
	}
	public void configura_climatizador(String climatizador) {//SETTER
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
		
	}
	public String dime_climatizador() {//GETTER
		if(climatizador==true) {
			return " El coche tiene climatizador ";
		}else {
			return " El coche tiene aire acondicionado";
		
		}
	}
	public String dime_peso_coche() {//SETTER+GETTER
		int peso_carroceria=500;
		int peso_total=peso_plataforma+peso_carroceria;
		if(asientos_cuero==true) {
			peso_total=peso_total+50;
		}
		if(climatizador==true) {
			peso_total=peso_total+20;
		}
		return " El peso del coche es " + peso_total;
	}
	public String precio_coche() {
		int precio_final=10000;
		if(asientos_cuero==true) {
			precio_final+=2000;
		}
		if(climatizador==true) {
			precio_final+=1500;
		}
		return " El precio del coche es " + precio_final;
		
	}
}
