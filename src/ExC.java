import javax.swing.JOptionPane;
public class ExC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int eleitor, voto, a=0, b=0, c=0, i;
	
	eleitor=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de pessoas que irão votar:"));
	
	for(i=1;i<=eleitor; i++) {	
		
		voto=Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o voto do eleitor nº:"+i+ "?"+
				                                                "\nDigite 1 para o candidato A"+
				                                                "\nDigite 2 para o candidato B"+
				                                                "\nDigite 3 para o candidato C"));
		if(voto==1) {
			a++;
		}
		else if(voto==2) {
			b++;
		}
		else if(voto==3) {
			c++;
		}
		else {	
		}
	}
	JOptionPane.showMessageDialog(null, "O candidato A teve:" +a+ "voto(s)."+
	                                    "\nO candidato B teve:" +b+ "voto(s)."+
			                            "\nO candidato C teve:" +c+ "voto(s).");
	}
}
