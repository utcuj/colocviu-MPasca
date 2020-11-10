import java.util.Scanner;
import java.awt.Color;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner in = new Scanner(System.in);
		
		int nrElicoptere = in.nextInt();
		System.out.println("Numar total elicoptere: " + nrElicoptere);
		
		Companie companie = new Companie();
		
		Sucursala sucursala1 = new Sucursala("Cluj");
		Sucursala sucursala2 = new Sucursala("Sibiu");
		Sucursala sucursala3 = new Sucursala("Timisoara");
		
		Elicopter elicopter1 = new Elicopter("a", Color.red, 2009, sucursala1);
		Elicopter elicopter2 = new Elicopter("b", Color.blue, 2011, sucursala1);
		Elicopter elicopter3 = new Elicopter("c", Color.gray, 1998, sucursala2);
		Elicopter elicopter4 = new Elicopter("d", Color.green, 2003, sucursala2);
		Elicopter elicopter5 = new Elicopter("e", Color.black, 2018, sucursala3);
		
		Basic client1 = new Basic("John Doe", sucursala1, 1);
		Premium client2 = new Premium("Jane Doe", sucursala2, 2);
		Guru client3 = new Guru("Maria", 1);
	
		companie.addSucursala(sucursala1);
		companie.addSucursala(sucursala2);
		companie.addSucursala(sucursala3);
		
		companie.addElicopter(elicopter1);
		companie.addElicopter(elicopter2);
		companie.addElicopter(elicopter3);
		companie.addElicopter(elicopter4);
		companie.addElicopter(elicopter5);
		
		companie.stergeElicopter(elicopter1);
		
		companie.listElicoptere(null);
		
		client1.inchiriazaElicopter(elicopter2);
		client3.inchiriazaElicopter(elicopter3);
		
		companie.listElicoptereDisponibile(null);
		
		client1.returneazaElicopter(elicopter2);
		client3.returneazaElicopter(elicopter3);

		
		client3.listElicoptere(companie);

		in.close();
	}

}
