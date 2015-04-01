package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		if ( (naziv == null) || (naziv.equals("")) ) {
			throw new RuntimeException("Greska! Naziv valute ne sme biti null i ne sme biti prazan string!");
		}
		this.naziv = naziv;
	}
	
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	
	public void setSkraceniNaziv(String skraceniNaziv) {
		if ( (skraceniNaziv == null) || (skraceniNaziv.equals("")) ) {
			throw new RuntimeException("Greska! Skraceni naziv valute ne sme biti null i ne sme biti prazan string!");
		}
		this.skraceniNaziv = skraceniNaziv;
	}
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	
	public void setDatum(GregorianCalendar datum) {
		if (datum == null) {
			throw new RuntimeException("Greska! Datum ne sme biti null!");
		}
		this.datum = datum;
	}
	
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	
	public void setProdajniKurs(double prodajniKurs) {
		if (prodajniKurs <= 0) {
			throw new RuntimeException("Greska! Prodajni kurs mora biti veci od 0!");
		}
		this.prodajniKurs = prodajniKurs;
	}
	
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	
	public void setKupovniKurs(double kupovniKurs) {
		if (kupovniKurs <= 0) {
			throw new RuntimeException("Greska! Kupovni kurs mora biti veci od 0!");
		}
		this.kupovniKurs = kupovniKurs;
	}
	
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	
	public void setSrednjiKurs(double srednjiKurs) {
		if (srednjiKurs <= 0) {
			throw new RuntimeException("Greska! Srednji kurs mora biti veci od 0!");
		}
		this.srednjiKurs = srednjiKurs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double
				.doubleToLongBits(other.kupovniKurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double
				.doubleToLongBits(other.prodajniKurs))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double
				.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv
				+ ", datum=" + datum + ", prodajniKurs=" + prodajniKurs
				+ ", kupovniKurs=" + kupovniKurs + ", srednjiKurs="
				+ srednjiKurs + "]";
	}
	
}
