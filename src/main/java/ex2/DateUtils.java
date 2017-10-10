package ex2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class DateUtils {
	// pour empêcher qu'on appelle DateUtils alors que c'est une classe utilitaire
	private DateUtils(){
		
	}
	// dans une date utilitaire, que des méthodes static
	public static String format(LocalDate date){
		if (date == null){
			return null;
		}
		return date.format(DateTimeFormatter.ofPattern("dd / MM / yyyy"));
	}

}
