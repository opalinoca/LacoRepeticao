import javax.swing.JOptionPane;

public class ExA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int i;
		int par=0;
		int impar=0;
		
		for(i=1; i<=10; i++) {
			
		   num = Integer.parseInt(JOptionPane.showInputDialog("Digite 10 números inteiros:"));
			
	       if ( num%2==0 ) {  
	    	   
	    	   par=par+1;
		
	}else {
          impar=impar+1;
	  }
	}
	       JOptionPane.showMessageDialog(null, "Tem "+par+" números pares,"+
	    		                               "\n E "+impar+" números ímpares.");
	}
}
  
