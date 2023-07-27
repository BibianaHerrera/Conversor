package Conversor;

import javax.swing.JOptionPane;

public class Funcion {
	
	ConversorPesos pesos=new ConversorPesos();
	ConversorDolares dolares=new ConversorDolares();
	ConversorEuros euros=new ConversorEuros();
	ConversorLibras libras=new ConversorLibras();
	ConversorYen yen=new ConversorYen();
	ConversorWonCoreano won=new ConversorWonCoreano();
	
	public void ConvertirMonedas(double miValor) {
		String conversor[]= {"de Pesos a Dolar","de Pesos a Euro","de Pesos a Libras","de Pesos a Yen","de Pesos a Won Corenano"
				,"de Dolar a Pesos","de Dolar a Euro","de Dolar a Libras","de Dolar a Yen","de Dolar a Won Coreano",
				"de Euro a Dolar","de Euro a Pesos","de Euro a Libra","de Euro a Yen","de Euro a Won Corenano"
				,"de Libras a Pesos","de Libras a Euro","de Libras a Dolar","de Libras a Yen","de Libras a Won Coreano"
				,"de Yen a Dolar","de Yen a Pesos","de Yen a Libra","de Yen a Euro","de Yen a Won Corenano"
				,"de Won Corenano a Pesos","de Won Corenano a Euro","de Won Corenano a Dolar","de Won Corenano a Yen","de Won Corenano a Libras"};
		String cambio=(String)JOptionPane.showInputDialog(null,"Elija la moneda a la cual desea convertir el dinero","Monedas",JOptionPane.PLAIN_MESSAGE,null,conversor,"seleccion");
		
		switch(cambio) {
		
		case "de Pesos a Dolar":
			pesos.ConvertirPesosaDolares(miValor);
			break;
		case "de Pesos a Euro":
			pesos.ConvertirPesosaEuro(miValor);
			break;
		case "de Pesos a Libras":
			pesos.ConvertirPesosaLibra(miValor);
			break;
		case "de Pesos a Yen":
			pesos.ConvertirPesosaYen(miValor);
			break;
		case "de Pesos a Won Corenano":
			pesos.ConvertirPesosaWonCoreano(miValor);
			break;
		case "de Dolar a Pesos":
			dolares.ConvertirDolaresaPesos(miValor);
			break;
		case "de Dolar a Euro":
			dolares.ConvertirDolresaEuro(miValor);
			break;
		case "de Dolar a Libras":
			dolares.ConvertirDolaresaLibra(miValor);
			break;
		case "de Dolar a Yen":
			dolares.ConvertirDolaresaYen(miValor);
			break;
		case "de Dolar a Won Coreano":
			dolares.ConvertirDolaresaWonCoreano(miValor);
			break;
		case "de Euro a Dolar":
			euros.ConvertirEurosaDolares(miValor);
			break;
		case "de Euro a Pesos":
			euros.ConvertirEurosaPesos(miValor);
			break;
		case "de Euro a Libra":
			euros.ConvertirEurosaLibra(miValor);
			break;
		case "de Euro a Yen":
			euros.ConvertirEurosaYen(miValor);
			break;
		case "de Euro a Won Corenano":
			euros.ConvertirEurosaWonCoreano(miValor);
			break;
		case "de Libras a Pesos":
			libras.ConvertirLibrasaPesos(miValor);
			break;
		case "de Libras a Euro":
			libras.ConvertirLibrasaEuro(miValor);
			break;
		case "de Libras a Dolar":
			libras.ConvertirLibrasaDolares(miValor);
			break;
		case "de Libras a Yen":
			libras.ConvertirLibrasaYen(miValor);
			break;
		case "de Libras a Won Coreano":
			libras.ConvertirLibrasaWonCoreano(miValor);
			break;
		case "de Yen a Dolar":
			yen.ConvertirYenaDolares(miValor);
			break;
		case "de Yen a Pesos":
			yen.ConvertirYenaPesos(miValor);
			break;
		case "de Yen a Libra":
			yen.ConvertirYenaLibra(miValor);
			break;
		case "de Yen a Euro":
			yen.ConvertirYenaEuro(miValor);
			break;
		case "de Yen a Won Corenano":
			yen.ConvertirYenaWonCoreano(miValor);
			break;
		case "de Won Corenano a Pesos":
			won.ConvertirWonaPesos(miValor);
			break;
		case "de Won Corenano a Euro":
			won.ConvertirWonaEuro(miValor);
			break;
		case "de Won Corenano a Dolar":
			won.ConvertirWonaDolares(miValor);
			break;
		case "de Won Corenano a Yen":
			won.ConvertirWonaYen(miValor);
			break;
		case "de Won Corenano a Libras":
			won.ConvertirWonaLibra(miValor);
			break;
		default: JOptionPane.showMessageDialog(null, "elección invalida");
		}		
		
	}
	
}
