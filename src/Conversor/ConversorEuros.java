package Conversor;

import javax.swing.JOptionPane;

public class ConversorEuros {
	
	public void ConvertirEurosaDolares(double valor) {
		double moneda=valor*1.0995;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" dolares");
	}
	
	public void ConvertirEurosaPesos(double valor) {
		double moneda=valor*4322.61;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" pesos");
	}
	
	public void ConvertirEurosaLibra(double valor) {
		double moneda=valor/1.19810;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" libras");
	}
	
	public void ConvertirEurosaYen(double valor) {
		double moneda=valor*155.12;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" yenes");
	}
	
	public void ConvertirEurosaWonCoreano(double valor) {
		double moneda=valor*1407.85;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" won coreano");
	}

}
