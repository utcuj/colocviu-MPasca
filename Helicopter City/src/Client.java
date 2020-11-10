
public abstract class Client {
	String nume;
	int bonus;
	public Client(String nume) {
		this.nume = nume;
	}

	public abstract int pretPlatit(int tarifPeOra, int nrDeOreInchiriate);
	public abstract void inchiriazaElicopter(Elicopter elicopter);
	public abstract void returneazaElicopter(Elicopter elicopter);
	public abstract void listElicoptere(Companie companie);
}
