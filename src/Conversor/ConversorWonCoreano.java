package Conversor;

import javax.swing.JOptionPane;

public class ConversorWonCoreano {
	
	public void ConvertirWonaDolares(double valor) {
		double moneda=valor*0.00078;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" dolares");
	}
	
	public void ConvertirWonaEuro(double valor) {
		double moneda=valor*0.00071;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" euros");
	}
	
	public void ConvertirWonaLibra(double valor) {
		double moneda=valor*0.00061;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" libras");
	}
	
	public void ConvertirWonaYen(double valor) {
		double moneda=valor*0.11;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" yenes");
	}
	
	public void ConvertirWonaPesos(double valor) {
		double moneda=valor*3.07;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" pesos");
	}

}
