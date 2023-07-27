package Conversor;

import javax.swing.JOptionPane;

public class ConversorDolares {
	
	public void ConvertirDolaresaPesos(double valor) {
		double moneda=valor*3915.16;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" pesos");
	}
	
	public void ConvertirDolresaEuro(double valor) {
		double moneda=valor/1.0995;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" euros");
	}
	
	public void ConvertirDolaresaLibra(double valor) {
		double moneda=valor/1.2843;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" libras");
	}
	
	public void ConvertirDolaresaYen(double valor) {
		double moneda=valor*141.05;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" yenes");
	}
	
	public void ConvertirDolaresaWonCoreano(double valor) {
		double moneda=valor*1280.65;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" won coreano");
	}

}
