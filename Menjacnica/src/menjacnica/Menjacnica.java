package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	public void dodajValutu(Valuta valuta) {
		if ( (valuta == null) || (valute.contains(valuta)) ) {
			throw new RuntimeException("Greska! Valuta ne sme biti null ili je valuta vec uneta!");
		}
		
		valute.add(valuta);
	}

	public void obrisiValutu(Valuta valuta) {

	}

	public Valuta pronadjiKurs(String naziv, GregorianCalendar datum) {
		return null;
	}

}
