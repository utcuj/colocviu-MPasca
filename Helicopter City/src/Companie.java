
public class Companie {
	Sucursala [] sucursale = new Sucursala[5];
	private int indexSucursala = 0;
	Elicopter [] elicoptere = new Elicopter[20];
	private int indexElicopter = 0;
	
	Client [] clienti = new Client[3];
	private int indexClient = 0;
	
	public void addElicopter(Elicopter elicopter) {
		elicoptere[indexElicopter++] = elicopter;
	}
	public void stergeElicopter(Elicopter elicopter) {
		for(int i = 0; i < indexElicopter; i++) {
			if(elicoptere[i] == elicopter) {
				for(int j = i; j < indexElicopter-1; j++) {
					elicoptere[j] = elicoptere[j+1];
				}
				indexElicopter--;
			}
		}
	}
	
	public void addSucursala(Sucursala sucursala) {
		sucursale[indexSucursala++] = sucursala;
	}
	
	public void addClient(Client client) {
		clienti[indexClient++] = client;
	}
	
	
	public void listElicoptere(Sucursala sucursala) {
		
		for(int i = 0; i < indexElicopter; i++) {
			if(elicoptere[i].sucursala == sucursala || sucursala == null)
				System.out.println("Elicopter: " + elicoptere[i].nume + " Inchiriat: " + elicoptere[i].inchiriat);
		}
	}
	
	public void listElicoptereDisponibile(Sucursala sucursala) {
		for(int i = 0; i < indexElicopter; i++) {
			if(elicoptere[i].inchiriat == false) {
				if(elicoptere[i].sucursala == sucursala || sucursala == null)
					System.out.println("Elicopter: " + elicoptere[i].nume + " Inchiriat: " + elicoptere[i].inchiriat);
			}
		}
	}

}
