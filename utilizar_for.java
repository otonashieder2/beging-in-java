import javax.swing.JOptionPane;

public class utilizar_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean arroba=false;
		String mail=JOptionPane.showInputDialog(" Introduce un mail valido ");
		for(int i=0 ; i<mail.length() ; i++ ) {
			if(mail.charAt(i)=='@') {
				arroba=true;				
			}
		}
		if(arroba==true) {
			System.out.println(" El mail es corecto ");
		}else {
			System.out.println(" El mail es incorecto ");
		}
			
		}
	}


