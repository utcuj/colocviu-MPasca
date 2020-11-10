
public class Guru extends Client{
	int bonus;
	String tip = "Guru";
	public Guru(String nume, int bonus) {
		super(nume);
		if(bonus == 1)
			this.bonus = 300;
		else
			this.bonus = 400;

	}


	@Override
	public void inchiriazaElicopter(Elicopter elicopter) {
		// TODO Auto-generated method stub
		if(elicopter.inchiriat) {
			System.out.println("Elicopterul " + elicopter.nume + " este inchiriat deja!");
		}
		elicopter.numeInchiriat = this.nume;
		elicopter.inchiriat = true;
		System.out.println("Elicopterul " + elicopter.nume + " a fost inchiriat cu pretul de: " + pretPlatit(80, 3*24) + " de catre " + this.nume + " de la sucursala: " + elicopter.sucursala.oras);

	}

//	@Override
	public void listElicoptere(Companie companie) {
		// TODO Auto-generated method stub
		companie.listElicoptere(null);
	}

	@Override
	public int pretPlatit(int tarifPeOra, int nrDeOreInchiriate) {
		// TODO Auto-generated method stub
		return tarifPeOra * nrDeOreInchiriate - this.bonus;
	}


	@Override
	public void returneazaElicopter(Elicopter elicopter) {
		// TODO Auto-generated method stub
		if(elicopter.inchiriat == false) {
			System.out.println("Elicopterul " + elicopter.nume + " nu este inchiriat!");
		}
		if(elicopter.numeInchiriat == this.nume) {
			elicopter.inchiriat = false;
			System.out.println("Elicopterul " + elicopter.nume + " a fost returnat de catre " + this.nume + " la sucursala: " + elicopter.sucursala.oras);
		}

	}

}
