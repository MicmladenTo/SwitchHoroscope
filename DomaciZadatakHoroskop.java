package domaciZadatak1812;

import java.util.Scanner;

public class DomaciZadatakHoroskop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mesec;
		int dan;

		Scanner scn = new Scanner(System.in);

		System.out.println("Unesite mesec roðenja: ");
		mesec = scn.next();

		System.out.println("Unesite dan roðenja: ");
		dan = scn.nextInt();
		

		switch (mesec) {
		case "januar": {
			if (dan < 21) {
				System.out.println("Vaš horoskopski znak je jarac.");
			} else if (dan >= 21 && dan <= 31) {
				System.out.println("Vaš horoskopski znak je vodolija.");
			} else {
				System.out.println("Niste uneli ispravan dan.");
			}
		}
			break;
		case "februar": {
			if (dan < 20) {
				System.out.println("Vaš horoskopski znak je vodolija.");
			} else if (dan >= 20 && dan <= 30) {
				System.out.println("Vaš horoskopski znak su ribe.");
			} else {
				System.out.println("Niste uneli ispravan dan.");
			}
		}
			break;
		case "mart": {
			if (dan < 21) {
				System.out.println("Vaš horoskopski znak su ribe.");
			} else if (dan >= 21 && dan <= 31) {
				System.out.println("Vaš horoskopski znak je ovan.");
			} else {
				System.out.println("Niste uneli ispravan dan.");
			}
		}
			break;
		case "april": {
			if (dan < 20) {
				System.out.println("Vaš horoskopski znak je ovan.");
			} else if (dan >= 20 && dan <= 30) {
				System.out.println("Vaš horoskopski znak je bik.");
			} else {
				System.out.println("Niste uneli ispravan dan.");
			}
		}
			break;
		case "maj": {
			if (dan < 21) {
				System.out.println("Vaš horoskopski znak je bik.");
			} else if (dan >= 21 && dan <= 31) {
				System.out.println("Vaš horoskopski znak su blizanci.");
			} else {
				System.out.println("Niste uneli ispravan dan.");
			}
		}
			break;
		case "jun": {
			if (dan < 22) {
				System.out.println("Vaš horoskopski znak su blizanci.");
			} else if (dan >= 22 && dan <= 30) {
				System.out.println("Vaš horoskopski znak je rak.");
			} else {
				System.out.println("Niste uneli ispravan dan.");
			}
		}
			break;
		case "jul": {
			if (dan < 23) {
				System.out.println("Vaš horoskopski znak je rak.");
			} else if (dan >= 23 && dan <= 31)  {
				System.out.println("Vaš horoskopski znak je lav.");
			} else {
				System.out.println("Niste uneli ispravan dan.");
			}
		}
			break;
		case "avgust": {
			if (dan < 24) {
				System.out.println("Vaš horoskopski znak je lav.");
			} else if (dan >= 24 && dan <= 31) {
				System.out.println("Vaš horoskopski znak je devica.");
			} else {
				System.out.println("Niste uneli ispravan dan.");
			}
		}
			break;
		case "septembar": {
			if (dan < 23) {
				System.out.println("Vaš horoskopski znak je devica.");
			} else if (dan >= 23 && dan <= 30) {
				System.out.println("Vaš horoskopski znak je vaga.");
			} else {
				System.out.println("Niste uneli ispravan dan.");
			}
		}
			break;
		case "oktobar": {
			if (dan < 23) {
				System.out.println("Vaš horoskopski znak je vaga.");
			} else if (dan >= 23 && dan <= 31) {
				System.out.println("Vaš horoskopski znak je škorpija.");
			} else {
				System.out.println("Niste uneli ispravan dan.");
			}
		}
			break;
		case "novembar": {
			if (dan < 22) {
				System.out.println("Vaš horoskopski znak je škorpija.");
			} else if (dan >= 22 && dan <= 30) {
				System.out.println("Vaš horoskopski znak je strelac.");
			} else {
				System.out.println("Niste uneli ispravan dan.");
			}
		}
			break;
		case "decembar": {
			if (dan < 22) {
				System.out.println("Vaš horoskopski znak je strelac.");
			} else if (dan >= 22 && dan <= 31) {
				System.out.println("Vaš horoskopski znak je jarac.");
			} else {
				System.out.println("Niste uneli ispravan dan.");
			}
		}
			break;
			default: System.out.println("Mesec roðenja nije ispravno unet.");
		}

	}

}

/* Napomena - ovo su efemeride za 2020. Za druge godine, efemeride imaju vrednosti koje ponegde
variraju za jedan dan.*/
