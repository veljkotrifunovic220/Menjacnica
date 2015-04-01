package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface MenjacnicaInterfejs {
	
	public void dodajValutu(Valuta valuta);
	public void obrisiValutu(Valuta valuta);
	public Valuta pronadjiKurs(String naziv, GregorianCalendar datum);
	
}
