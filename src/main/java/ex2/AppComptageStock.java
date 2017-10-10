package ex2;

import java.time.LocalDate;

public class AppComptageStock {

	public static void main(String[] args) {

		ComptageStock comptage = new ComptageStock(LocalDate.of(2017, 11, 12));
		comptage.ajouterElement(500);
		comptage.ajouterElement(1000);
		comptage.afficheStatutComptage(TypeComptage.MOYENNE);
	}

}
