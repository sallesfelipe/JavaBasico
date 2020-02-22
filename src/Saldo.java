import java.util.Scanner;

public class Saldo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu salário: ");
		long salario = scanner.nextLong();

		double reajuste = 0.01;
		long saldo = (long) (salario * (reajuste + 1));

		System.out.println("seu salario com reajuste é: " + saldo);
	}
}