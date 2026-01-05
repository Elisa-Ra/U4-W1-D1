// Implementare i seguenti metodi:

// perimetroRettangolo: che accetta la lunghezza decimale dei due lati di un rettangolo
// e ne calcola il perimetro

// pariDispari: che accetta un numero intero e restituisce 0 se il numero è pari
// e 1 se è dispari

// perimetroTriangolo: che accetta le lunghezze decimali dei lati di un triangolo e ne
// restituisce l'area (è possibile usare la formula di Erone)

// Scrivere un main che utilizzi in sequenza i tre metodi chiedendo l'input dei dati all'utente

import java.util.Scanner;

public class Es3 {

    public static void main(String[] args) {
        System.out.println("Esercizio 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi la base e poi l'altezza del rettangolo.");
        double base = sc.nextDouble();
        double altezza = sc.nextDouble();
        perimetroRettangolo(base, altezza);

        System.out.println("Esercizio 2");
        System.out.println("Scrivi un numero, se il resto è 0 il numero è pari, con 1 è dispari.");
        int num = sc.nextInt();
        System.out.println(pariDispari(num));

        System.out.println("Esercizio 3");
        System.out.println("Scrivi la lunghezza dei tre lati del triangolo, per saperne l'area.");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        perimetroTriangolo(num1, num2, num3);
    }
    // ------------- METODO perimetroRettangolo --------------
    public static void perimetroRettangolo(double base, double altezza) {
        double sum = base + altezza;
        double perimetro = sum * 2;
        System.out.println(  "Il perimetro del rettangolo è: " + perimetro );
    }
// ------------- METODO pariDispari --------------
public static int pariDispari(int num) {
        return num % 2;
}

// ------------- METODO perimetroTriangolo --------------
public static void perimetroTriangolo(double num1, double num2, double num3) {
        double perimetro = num1 + num2 + num3;
        double semip = perimetro / 2;
        double semip1 = semip - num1;
        double semip2 = semip - num2;
        double semip3 = semip - num3;
        double result = semip * semip1 * semip2 * semip3;
        double radice = Math.sqrt(result);
    System.out.println("L'area del triangolo è: " + radice);
}
}
