/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1008;

import java.util.Scanner;

public class Projeto1008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, horas;
        double valordosalario, salario;
        numero = sc.nextInt();
        horas = sc.nextInt();
        valordosalario = sc.nextDouble();
        salario = horas * valordosalario;
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
