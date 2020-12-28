import javax.swing.*;
public class contraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave="eder";
		String usuario="";
		while(clave.equals(usuario)==false) {
			usuario=JOptionPane.showInputDialog("Introduce la contraseña , porfavor");
			if(clave.equals(usuario)==false) {
				System.out.println("Contraseña incorrecta");	
			}
		}
		System.out.println("contraeña correcta , puedes acceder");
	}

}
