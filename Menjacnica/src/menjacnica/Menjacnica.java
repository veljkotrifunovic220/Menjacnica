package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	public void dodajValutu(Valuta valuta) {
		if (valuta == null) {
			throw new RuntimeException("Greska! Valuta ne sme biti null!");
		}
		
		if (valute.contains(valuta)) {
			throw new RuntimeException("Greska! Ova valuta je vec uneta!");
		}
		
		valute.add(valuta);
	}

	public void obrisiValutu(Valuta valuta) {
		if (valuta == null) {
			throw new RuntimeException("Greska! Valuta ne sme biti null!");
		}
		
		if ( !(valute.contains(valuta)) ) {
			throw new RuntimeException("Taj kurs ne postoji");
		}
		
		valute.remove(valuta);
	}

	public Valuta pronadjiKurs(String naziv, GregorianCalendar datum) {
		if ( (naziv == null) || (datum == null) ) {
			throw new RuntimeException("Greska! Morate uneti i naziv valute i datum!");
		}
		
		Valuta valuta = new Valuta();
		
		for (int i = 0; i < valute.size(); i++) {
			if ( (valute.get(i).getNaziv().equals(naziv) || valute.get(i).getSkraceniNaziv().equals(naziv)) 
					&& (valute.get(i).getDatum().equals(datum)) ) {
				valuta = valute.get(i);
				break;
			}
		}
		
		return valuta;
	}

}
