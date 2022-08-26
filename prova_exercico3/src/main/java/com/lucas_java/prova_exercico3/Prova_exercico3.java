package com.lucas_java.prova_exercico3;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Prova_exercico3 {

    public static void main(String[] args) {
        double massa = 0, massaInicial;
        double tempo = 50;
        int contador = 0;
        double segundos = 0, minutos = 0, horas = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a massa: ");
        massa = sc.nextDouble();
        massaInicial = massa;

        while (massa > 0.5) {
            massa = massa / 2;
            contador++;
        }

        tempo = tempo * contador;
        segundos = tempo;
        minutos = tempo / 60;
        horas = minutos / 60;
        System.out.println("Massa INICIAL: " + massaInicial);
        System.out.println("Massa FINAL: " + massa);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }

}
