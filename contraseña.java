import javax.swing.*;
public class contraseņa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave="eder";
		String usuario="";
		while(clave.equals(usuario)==false) {
			usuario=JOptionPane.showInputDialog("Introduce la contraseņa , porfavor");
			if(clave.equals(usuario)==false) {
				System.out.println("Contraseņa incorrecta");	
			}
		}
		System.out.println("contraeņa correcta , puedes acceder");
	}

}
