/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wsCalculadora.iscrquinter.hotmail.com;

import wsCalculadora.iscrquinter.hotmail.com.Calculadora.Calculadora;

public class App {
    Calculadora c;

    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        System.out.println("Calculadora aritmetica");
        System.out.println("======================");
        System.out.println("2+3=" + c.suma(2, 3));
        System.out.println("2-3=" + c.resta(2, 3));
        System.out.println("Autor: Ricardo Rafael Quintero Meza");
    }
}
