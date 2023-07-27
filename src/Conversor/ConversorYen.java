package Conversor;

import javax.swing.JOptionPane;

public class ConversorYen {
	
	public void ConvertirYenaDolares(double valor) {
		double moneda=valor/141.083;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" dolares");
	}
	
	public void ConvertirYenaEuro(double valor) {
		double moneda=valor/155.022;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" euros");
	}
	
	public void ConvertirYenaLibra(double valor) {
		double moneda=valor/181.166;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" libras");
	}
	
	public void ConvertirYenaPesos(double valor) {
		double moneda=valor*27.82;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" pesos");
	}
	
	public void ConvertirYenaWonCoreano(double valor) {
		double moneda=valor*9.08;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" won coreano");
	}

}
