package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
    public void ConvertirMonedas(double valor) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos a Dólar":
        	monedas.ConvertirPesosADolares(valor);
        	break;
        case "De Pesos a Euro":
        	monedas.ConvertirPesosAEuros(valor);
        	break;
        case "De Pesos a Libras":
        	monedas.ConvertirPesosALibras(valor);
        	break;
        case "De Pesos a Yen":
        	monedas.ConvertirPesosAYen(valor);
        	break;
        case "De Pesos a Won Coreano":
        	monedas.ConvertirPesosAWon(valor);
        	break;    	    	                          
        case "De Dólar a Pesos":
        	pesos.ConvertirDolaresAPesos(valor);
        	break;
        case "De Euro a Pesos":
        	pesos.ConvertirEurosAPesos(valor);
        	break;
        case "De Libras a Pesos":
        	pesos.ConvertirLibrasAPesos(valor);
        	break;
        case "De Yen a Pesos":
        	pesos.ConvertirYenAPesos(valor);
        	break;
        case "De Won Coreano a Pesos":
            pesos.ConvertirWonAPesos(valor);
            break;
        }      
    }
}
