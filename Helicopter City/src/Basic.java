
public class Basic extends Client{
	int bonus;
	Sucursala sucursala;
	String tip = "Basic";
	public Basic(String nume, Sucursala sucursala, int bonus) {
		super(nume);
		this.sucursala = sucursala;
		if(bonus == 1)
			this.bonus = 100;
		else
			this.bonus = 200;
	}


	@Override
	public void inchiriazaElicopter(Elicopter elicopter) {
		// TODO Auto-generated method stub
		if(elicopter.inchiriat == false) {
			if(elicopter.sucursala == this.sucursala) {
				elicopter.inchiriat = true;
				elicopter.numeInchiriat = this.nume;
				System.out.println("Elicopterul " + elicopter.nume + " a fost inchiriat cu pretul de: " + pretPlatit(80, 3*24) + " de catre " + this.nume + " de la sucursala: " + elicopter.sucursala.oras);
				return;
			}
			System.out.println("Nu se poate imprumuta de la aceasta sucursala!");
		}else
			System.out.println("Elicopter inchiriat");
	}

//	@Override
	public void listElicoptere(Companie companie) {
		// TODO Auto-generated method stub
		companie.listElicoptere(this.sucursala);
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
		if(elicopter.numeInchiriat == this.nume && elicopter.sucursala == this.sucursala) {
			elicopter.inchiriat = false;
			System.out.println("Elicopterul " + elicopter.nume + " a fost returnat de catre " + this.nume + " la sucursala: " + elicopter.sucursala.oras);
		}
	}

}
