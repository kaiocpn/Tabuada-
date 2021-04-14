
import java.util.Scanner;

public class inteligente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Ler = new Scanner (System.in);
		
		int n, X;
		
		
		System.out.println("---------------------------");
		System.out.println("         TABUADA           ");
		System.out.println("---------------------------");
		System.out.println("DIGITE O NUMERO: ");
		n = Ler.nextInt();
		
		System.out.println(" DIGITE A OPERAÇÃO DESEJADA ");
		System.out.println(" 1 - ADIÇÃO ");
		System.out.println(" 2 - SUBTRAÇÃO ");
		System.out.println(" 3 - MULTIPLICAÇÃO ");
		System.out.println(" 4 - DIVISSÃO  ");
		X = Ler.nextInt();
		
		
		if (X == 1) {
			System.out.println(n + " + 1 = " + (n + 1) );
			System.out.println(n + " + 2 = " + (n + 2) );
			System.out.println(n + " + 3 = " + (n + 3) );
			System.out.println(n + " + 4 = " + (n + 4) );
			System.out.println(n + " + 5 = " + (n + 5) );
			System.out.println(n + " + 6 = " + (n + 6) );
			System.out.println(n + " + 7 = " + (n + 7) );
			System.out.println(n + " + 8 = " + (n + 8) );
			System.out.println(n + " + 9 = " + (n + 9) );
			System.out.println(n + " + 10 = " + (n + 10) );
		} else if (X == 2){
			System.out.println(n + " - 1 = " + (n - 1) );
			System.out.println(n + " - 2 = " + (n - 2) );
			System.out.println(n + " - 3 = " + (n - 3) );
			System.out.println(n + " - 4 = " + (n - 4) );
			System.out.println(n + " - 5 = " + (n - 5) );
			System.out.println(n + " - 6 = " + (n - 6) );
			System.out.println(n + " - 7 = " + (n - 7) );
			System.out.println(n + " - 8 = " + (n - 8) );
			System.out.println(n + " - 9 = " + (n - 9) );
			System.out.println(n + " - 10 = " + (n - 10) );
		} else if (X == 3){
			System.out.println(n + " x 1 = " + (n * 1) );
			System.out.println(n + " x 2 = " + (n * 2) );
			System.out.println(n + " x 3 = " + (n * 3) );
			System.out.println(n + " x 4 = " + (n * 4) );
			System.out.println(n + " x 5 = " + (n * 5) );
			System.out.println(n + " x 6 = " + (n * 6) );
			System.out.println(n + " x 7 = " + (n * 7) );
			System.out.println(n + " x 8 = " + (n * 8) );
			System.out.println(n + " x 9 = " + (n * 9) );
			System.out.println(n + " x 10 = " + (n * 10) );
	}	 else if (X == 4){
			System.out.println(n + " / 1 = " + (n / 1) );
			System.out.println(n + " / 2 = " + (n / 2) );
			System.out.println(n + " / 3 = " + (n / 3) );
			System.out.println(n + " / 4 = " + (n / 4) );
			System.out.println(n + " / 5 = " + (n / 5) );
			System.out.println(n + " / 6 = " + (n / 6) );
			System.out.println(n + " / 7 = " + (n / 7) );
			System.out.println(n + " / 8 = " + (n / 8) );
			System.out.println(n + " / 9 = " + (n / 9) );
			System.out.println(n + " / 10 = " + (n / 10) );
	}	else 
		System.out.println("Numero invalido");
		{

		}
		
		
	}

}
