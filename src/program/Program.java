package program;

import java.util.Scanner;

import entities.BrazilInterestService;
import entities.Loan;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("informações do emprestimo: ");
		System.out.print("Total do emprestimo: ");
		Double total = sc.nextDouble();
		System.out.print("Quantidade de meses: ");
		int meses = sc.nextInt();

		Loan emp = new Loan(total, meses, new BrazilInterestService());

		System.out.println();
		System.out.println("pagamento após " + meses + " meses: ");

		System.out.println(emp.toString());

		sc.close();

	}

}
