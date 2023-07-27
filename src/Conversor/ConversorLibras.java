package Conversor;

import javax.swing.JOptionPane;

public class ConversorLibras {
	
	public void ConvertirLibrasaDolares(double valor) {
		double moneda=valor*1.2843;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" dolares");
	}
	
	public void ConvertirLibrasaEuro(double valor) {
		double moneda=valor*1.1681364;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" euros");
	}
	
	public void ConvertirLibrasaPesos(double valor) {
		double moneda=valor*5037.0969;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" pesos");
	}
	
	public void ConvertirLibrasaYen(double valor) {
		double moneda=valor*181.18;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" yenes");
	}
	
	public void ConvertirLibrasaWonCoreano(double valor) {
		double moneda=valor*1644.37;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" won coreano");
	}

}
