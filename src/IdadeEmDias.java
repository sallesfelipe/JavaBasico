import java.util.Scanner;

public class IdadeEmDias {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos anos voce tem? ");
		int year = scanner.nextInt();
		
		System.out.print("Quantos meses voce tem? ");
		int month = scanner.nextInt();
		
		System.out.print("Quantos dias voce tem? ");
		int day = scanner.nextInt();
		
		int dateInDays = (year * 365) + (month * 30) + day;
		
		System.out.println("Sua idade em dias é: " +  dateInDays);
	}
}