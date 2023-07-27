import javax.swing.JOptionPane;
import Conversor.Funcion;
import Medidas.FuncionMedidas;

public class Principal {
	public static void main(String[] args) {
		
		Funcion monedas=new Funcion();
		FuncionMedidas medida=new FuncionMedidas();
		boolean flag=true;
		
		while(flag) {
			
			String opciones[]= {"Convertor de moneda","Convertor de distancia"};
			
			String seleccion;
			seleccion=(String)JOptionPane.showInputDialog(null,"Seleccione una opción de conversión","menu",JOptionPane.PLAIN_MESSAGE,null,opciones,"Tipo de convertor");
			
			
			if(seleccion=="Convertor de moneda") {
				
				String cantidad=(JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero que desea convertir"));
				
				if(ValidarNumero(cantidad)) {
					double miValor=Double.parseDouble(cantidad);
					
					monedas.ConvertirMonedas(miValor);
					
					int confirmacion=JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
					if(confirmacion==JOptionPane.OK_OPTION) {
						
					}else {
						JOptionPane.showMessageDialog(null,"Programa finalizado");
						flag=false;
					}
					
				}
				
			}else if(seleccion=="Convertor de distancia"){
				
				String distancia=(JOptionPane.showInputDialog(null,"Ingrese la distancia a convertir"));
				
				if(ValidarNumero(distancia)) {
					double miDistancia=Double.parseDouble(distancia);
					
					medida.ConvertirMedidas(miDistancia);
					int confirmacion=JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
					if(confirmacion==JOptionPane.OK_OPTION) {
						
					}else {
						JOptionPane.showMessageDialog(null,"Programa finalizado");
						flag=false;
					}								
			}					
		} else {
			flag=false;
	}
			
}
		  
	}
	
	public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            return true;}                     	 
        catch (NumberFormatException e) {
        		JOptionPane.showMessageDialog(null, "Dato invalido");
                return false;
            }
    }

}
