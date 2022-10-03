import java.util.Scanner;

public class Ex_2_NumeroInformado {
    public static void main(String[] args){
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        n = sc.nextInt();
        System.out.println("\nO número informado foi: " + n);
    }
}
