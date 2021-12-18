package src;

import java.util.Scanner;

public class Vaixells {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char[][] map = new char[5][5];
		boolean check = false, ship1 = false, ship2 = false;
		byte ship1Row, ship1Col, ship2Row, ship2Col;
		String coordInput = null;
		byte coordInputNum = 0;
		int trys = 0;

		ship1Row = (byte) ((byte) (Math.random() * 5)+1);
		ship1Col = (byte) ((byte) (Math.random() * 5)+1);

		ship2Row = (byte) ((byte) (Math.random() * 5)+1);
		ship2Col = (byte) ((byte) (Math.random() * 5)+1);

		for (int i = 0; i < map.length; i++) {
			for (int e = 0; e < map.length; e++) {
				map[i][e] = '*';
			}
		}

		System.out.println("Benvingut al joc dels vaixells");

		while (true) {
			System.out.println("  A B C D E");
			for (int i = 0; i < map.length; i++) {
				System.out.print(i+1);
				for (int e = 0; e < map.length; e++) {
					System.out.printf("%2c",map[i][e]);
				}
				System.out.println();
			}
			
			if (ship1 && ship2) {
				break;
			}

			while (!check) {
				check = true;
				System.out.print("Introdueix la teva coordenada en format \"D3\": ");
				try {
					coordInput = input.nextLine();
					if (coordInput.length() != 2) {
						System.out.print("El format introduit no és correcte. ");
						check = false;
					}
					if (coordInput.charAt(0) < 'A' || coordInput.charAt(0) > 'E') {
						System.out.print("La lletra ha de estar entre A i E. ");
						check = false;
					} else if (coordInput.charAt(1) < '1' || coordInput.charAt(1) > '5') {
						System.out.print("El número ha de estar entre 1 i 5. ");
						check = false;
					}
				} catch (Exception ex) {
					System.out.print("El format introduit no és correcte. Recorda el format \"D1\". ");
				}
			}
			
			check = false;

			switch (coordInput.charAt(0)) {
			case 'A':
				coordInputNum = 1;
				break;
			case 'B':
				coordInputNum = 2;
				break;
			case 'C':
				coordInputNum = 3;
				break;
			case 'D':
				coordInputNum = 4;
				break;
			case 'E':
				coordInputNum = 5;
				break;

			}

			if (coordInputNum == ship1Col && Character.getNumericValue(coordInput.charAt(1)) == ship1Row) {
				if (ship1) {
					System.out.println("Ja has acabat amb aquest vaixell!");
				} else {
					ship1 = true;
					map[ship1Row-1][ship1Col-1] = 'V';
					trys++;
					System.out.println("Tocat i enfonsat. Queda un vaixell.");
				}
			} else if (coordInputNum == ship2Col && Character.getNumericValue(coordInput.charAt(1)) == ship2Row) {
				if (ship2) {
					System.out.println("Ja has acabat amb aquest vaixell!");
				} else {
					ship2 = true;
					map[ship2Row-1][ship2Col-1] = 'V';
					trys++;
					System.out.println("Tocat i enfonsat. Queda un vaixell.");
					
				}
			} else {
				System.out.println("Aquí no hi ha cap vaixell!");
				System.out.println(coordInputNum);
				System.out.println(Character.getNumericValue(coordInput.charAt(1)));
				map[Character.getNumericValue(coordInput.charAt(1))-1][coordInputNum-1] = 'A';
				trys++;
			}

		}
		
		System.out.println("Has guanyat en "+trys+" Enhorabona!");
		input.close();

	}

}
