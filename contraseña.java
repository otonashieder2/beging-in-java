import javax.swing.*;
public class contrase�a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave="eder";
		String usuario="";
		while(clave.equals(usuario)==false) {
			usuario=JOptionPane.showInputDialog("Introduce la contrase�a , porfavor");
			if(clave.equals(usuario)==false) {
				System.out.println("Contrase�a incorrecta");	
			}
		}
		System.out.println("contrae�a correcta , puedes acceder");
	}

}
