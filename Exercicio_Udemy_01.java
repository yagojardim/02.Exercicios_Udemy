import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);

	double aprovado = 60;
	double nota01 = sc.nextDouble();
	double nota02 = sc.nextDouble();
	
	double soma = nota01 + nota02;
   System.out.printf("NOTA FINAL = %.1f%n", soma);  
    
   if (soma < 60) {
   System.out.printf("REPROVADO"); 
    
        }		
	}

}