
public class Sucursala {
	String oras;
	public Sucursala(String oras) {
		this.oras = oras;
	}
	
	Elicopter [] elicoptere = new Elicopter[10];
	private int index = 0;
	
	public void addElicopter(Elicopter elicopter) {
		elicoptere[index++] = elicopter;
	}
	

}
