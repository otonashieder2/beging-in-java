package opp;

public class Furgoneta extends coche {
	public Furgoneta(int capacidad_carga,int plazas_extra) {
		super();// invoca al "contructor " de la clase "coche(la clase padre)"
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
	}
	private int capacidad_carga;
	private int plazas_extra;
	
	public String dameDatosFurgoneta() {
		return " La capacidad de carga es : " + capacidad_carga + " Las plazas extras son :" + plazas_extra;
	}

}
