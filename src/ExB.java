import javax.swing.JOptionPane;
public class ExB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int livro=1;
		
		while(livro>0 && livro<=4) {
			livro = Integer.parseInt(JOptionPane.showInputDialog("Escolha um livro para saber o pre�o:"+
		                                                          "\n Digite 1 - Java"+
					                                              "\n Digite 2 - Android"+
		                                                          "\n Digite 3 - C#"+
					                                              "\n Digite 4 - PHP"+
		                                                          "\n Ou digite 0 para fechar o programa"));
			if(livro==1) {
				JOptionPane.showMessageDialog(null, "O pre�o � $100.");
			}
			else if(livro==2) {
				JOptionPane.showMessageDialog(null, "O pre�o � $180.");
			}
			else if(livro==3) {
				JOptionPane.showMessageDialog(null, "O pre�o � $80");
			}
			else if(livro==4) {
				JOptionPane.showMessageDialog(null, "O pre�o � $60");
			}
			else {	
			}
		} 
	}
}
