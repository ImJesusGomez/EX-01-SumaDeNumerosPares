package retos_practica;

import java.io.*;

public class Suma_de_Numeros_Pares {

    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        
        System.out.println("Dime el numero maximo: ");
        int n = Integer.parseInt(teclado.readLine());
        
        System.out.println("La suma de los numeros pares hasta el numero: " + n + " es de: " + sumaNumerosPares(n));
    }

    public static int sumaNumerosPares(int n) {
        
        int sumaAcumulada = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sumaAcumulada = sumaAcumulada + i;

            }
        }
        return sumaAcumulada;
    }

}
