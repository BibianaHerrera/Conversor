package Medidas;

import javax.swing.JOptionPane;

public class ConversorMedidas {
	
	public void ConvertirMilimetrosaCentrimetos(double distancia) {
		double medida=distancia*0.1;
		JOptionPane.showMessageDialog(null, "esta medida son "+medida+" centimetros");
	}
	
	public void ConvertirCentimetrosaMetros(double distancia) {
		double medida=distancia*0.01;
		JOptionPane.showMessageDialog(null, "esta medida son "+medida+" metros");
	}
	
	public void ConvertirMetrosaKilometros(double distancia) {
		double medida=distancia*0.001;
		JOptionPane.showMessageDialog(null, "esta medida son "+medida+" kilometros");
	}
	
	public void ConvertirCentimetrosaPulgadas(double distancia) {
		double medida=distancia*0.3937;
		JOptionPane.showMessageDialog(null, "esta medida son "+medida+" pulgadas");
	}
	
	public void ConvertirPulgadasaPies(double distancia) {
		double medida=distancia*0.08333;
		JOptionPane.showMessageDialog(null, "esta medida son "+medida+" pies");
	}

}
