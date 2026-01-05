// Esercizio 1:
// Implementare i seguenti metodi:
// - moltiplica: accetta due interi e ritorna il loro prodotto
// - concatena: accetta una stringa e un intero e restituisce una stringa che concatena gli elementi
// - inseriscilnArray: accetta un array di stringhe di cinque elementi e una stringa
// e restituisce un array di sei elementi in cui la stringa passata sia al terzo posto e le stringhe
// precedentemente in quarta e quinta posizione siano rispettivamente in quinta e sesta.
// Scrivere un main che invochi in sequenza i tre metodi realizzati
public class Es1 {
    public static void main(String[] args) {


 // invoco moltiplica e printMoltiplica
        int result = moltiplica(10, 5);
        System.out.println(result);
        printMoltiplica(10, 5);

 // invoco concatena
        concatena("Esercizio", 1);

 // invoco inseriscilnArray
        String[] arrayStringhe = {"Elemento1", "Elemento2", "Elemento3", "Elemento4", "Elemento5"};
        inseriscilnArray(arrayStringhe, "StringaInserita");

    }
    // ------------- METODO MOLTIPLICA ---------------
    // Faccio due tipi di metodi diversi, il primo è con il return
    public static int moltiplica(int num1, int num2) {
        return num1 * num2;
    }
    // il secondo è con println
    public static void printMoltiplica(int num1, int num2) {
        System.out.println("La moltiplicazione di " + num1 + "*" + num2 + " è: " + (num1 * num2));
    }

    // ------------- METODO CONCATENA ---------------
    public static void concatena (String stringa, int numIntero) {
        System.out.println(stringa + " " + numIntero);
    }

    // ------------- METODO inseriscilnArray ---------------

    public static void inseriscilnArray (String[] arraySt, String singolaStringa) {
        System.out.println(arraySt[0] + " " + arraySt[1] + " " + singolaStringa + " " + arraySt[2] + " "
                + arraySt[3] + " " +  arraySt[4]);
    }
}