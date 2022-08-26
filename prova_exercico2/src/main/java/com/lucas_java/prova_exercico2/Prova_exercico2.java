/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas_java.prova_exercico2;

/**
 *
 * @author lucas
 */
public class Prova_exercico2 {

   public static void main(String[] args) {
       double porcentagem = 0;
       double salario = 1000;
       porcentagem = (1.5 / 100);
       salario = salario + (salario * porcentagem);
        for (int i = 1; i <= 25; i++) {
        porcentagem = porcentagem * 2;
           salario = salario + (salario*porcentagem);
        }
       System.out.println("Salário atual: R$" + salario);
   }
}

