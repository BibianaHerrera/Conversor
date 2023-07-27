package Conversor;

import javax.swing.JOptionPane;

public class ConversorPesos {
	
	public void ConvertirPesosaDolares(double valor) {
		double moneda=valor/3915.16;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" dolares");
	}
	
	public void ConvertirPesosaEuro(double valor) {
		double moneda=valor/4378.29;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" euros");
	}
	
	public void ConvertirPesosaLibra(double valor) {
		double moneda=valor/5042.1322;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" libras");
	}
	
	public void ConvertirPesosaYen(double valor) {
		double moneda=valor/27.82;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" yenes");
	}
	
	public void ConvertirPesosaWonCoreano(double valor) {
		double moneda=valor/3.07;
		JOptionPane.showMessageDialog(null,"Usted tiene $"+moneda+" won coreano");
	}

}
