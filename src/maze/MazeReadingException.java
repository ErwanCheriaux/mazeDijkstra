package maze;

public class MazeReadingException extends Exception {

	MazeReadingException(String fileName, int numero, String msg) {
		System.out.println("Une erreur dans le fichier " + fileName + " a �t� d�tect� � la ligne " + numero + ".");
		System.out.println("L'erreur est : " + msg);
	}
}
