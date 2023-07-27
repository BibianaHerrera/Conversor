package Medidas;

import javax.swing.JOptionPane;

public class FuncionMedidas {
	
	ConversorMedidas medida=new ConversorMedidas();
	
	public void ConvertirMedidas(double miDistancia) {
		String[] opcionMedidas= {"de milimetros a centrimetros","de centrimetros a metros","de metros a kilometros","centrimetros a pulgadas","de pulgadas a pies"};
		String cambio=(String)JOptionPane.showInputDialog(null,"Elija la medida que desea convertir","Medidas",JOptionPane.PLAIN_MESSAGE,null,opcionMedidas,"seleccion");
		
		switch(cambio) {
		case"de milimetros a centrimetros":
			medida.ConvertirMilimetrosaCentrimetos(miDistancia);
			break;
		case "de centrimetros a metros":
			medida.ConvertirCentimetrosaMetros(miDistancia);
			break;
		case "de metros a kilometros":
			medida.ConvertirMetrosaKilometros(miDistancia);
			break;
		case "centrimetros a pulgadas":
			medida.ConvertirCentimetrosaPulgadas(miDistancia);
			break;
		case "de pulgadas a pies":
			medida.ConvertirPulgadasaPies(miDistancia);
			break;
		default:JOptionPane.showMessageDialog(null,"eleccion invalida");
			
		}
		
	}	

}
