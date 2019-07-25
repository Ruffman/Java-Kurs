package kurs;

public class Auto 
{ 
	private int _leistung;
	private String _hersteller;
	
	// Initialisierungsblock, da im Klassenrumpf. Reihenfolge der Initblöcke ist wichtig! Normal für komplexe init benutzt
	{
		_leistung = -1;
		_hersteller = "default";
	}
	
	public void tunen(int tuneWert) 
	{
		_leistung = _leistung + tuneWert;
	}
	
	public Auto(int leistung, String hersteller)
	{
		_leistung = leistung;
		_hersteller = hersteller;
	}
	
	public int getLeistung()
	{
		return _leistung;
	}
	
	public String getHersteller()
	{
		return _hersteller;
	}
	
	public void setLeistung(int leistung)
	{
		_leistung = leistung;
	}
	
	public void setHersteller(String hersteller)
	{
		_hersteller = hersteller;
	}
}

class Kunde 
{

	String vorname, nachname;
	int kundenNummer;
	

	void nummerAendern(int neueNummer) {
		kundenNummer = neueNummer;
	}
	
	void namenAendern(String derVorname, String derNachname)
	{
		vorname = derVorname;
		nachname = derNachname;
	}
	
	Kunde(String derVorname, String derNachname, int dieKundenNummer) {
		vorname = derVorname;
		nachname = derNachname;
		kundenNummer = dieKundenNummer;
	}
}

class Obst 
{
	String sorte;
	int einkaufsPreis, verkaufsPreis; // in EUR Cent
	int naehrwert; // in kcal
	boolean isBoosted = false;
	
	void boost()
	{
		verkaufsPreis *= 2;
		isBoosted = true;
		naehrwert += 50;
	}
	
	Obst(String dieSorte, int EKP, int derNaehrwert)
	{
		sorte = dieSorte;
		einkaufsPreis = EKP;
		verkaufsPreis = 2*EKP;
		naehrwert = derNaehrwert;
	}

	
	
}