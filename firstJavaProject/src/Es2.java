// ESERCIZIO 2:
// Implementare un metodo main che chiede all'utente di inserire tre stringhe da tastiera
// e scrive in console la concatenazione delle stringhe in ordine di inserimento e in ordine
// di inserimento inverso

import java.util.Scanner;
public class Es2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Scrivi tre parole");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();

        System.out.println("Ordine di inserimento: " + str1 + " " + str2 + " " + str3 + " ");
        System.out.println("Ordine di inserimento: " + str3 + " " + str2 + " " + str1 + " ");

    }


}
