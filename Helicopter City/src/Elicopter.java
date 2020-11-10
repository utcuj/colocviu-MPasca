import java.awt.Color;

public class Elicopter {
	String nume;
	Color culoare;
	int anulFabricatiei;
	String numeInchiriat;
	Sucursala sucursala;
	
	public Elicopter(String nume, Color culoare, int anulFabricatiei, Sucursala sucursala) {
		this.nume = nume;
		this.culoare = culoare;
		this.anulFabricatiei = anulFabricatiei;
		this.sucursala = sucursala;
		sucursala.addElicopter(this);
	}
	
	boolean inchiriat;
	
	public Elicopter() {
		this.inchiriat = false;
	}
}
