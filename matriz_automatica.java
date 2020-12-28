import javax.swing.JOptionPane;

public class matriz_automatica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []paises=new String[8];
		for(int i=0;i<8;i++) {
			paises[i]=JOptionPane.showInputDialog(" Introduce pais " + (i+1));
			
		}
		int i=0;
		for(String elemento:paises) {			
			i++;
			
			System.out.println(" Pais " + i + " " + elemento);
		}

	}

}
