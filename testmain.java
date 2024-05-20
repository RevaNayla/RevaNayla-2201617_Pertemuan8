/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepolymorphism;

/**
 *
 * @author Windows
 */
import java.util.Scanner;
public class testmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi1: ");
        double side1 = input.nextDouble();

        System.out.print("Masukkan sisi2: ");
        double side2 = input.nextDouble();

        System.out.print("Masukkan sisi3: ");
        double side3 = input.nextDouble();

        System.out.print("Masukkan warna: ");
        String color = input.next();

        System.out.print("Apakah segitiga terisi (true/false)? ");
        boolean filled = input.nextBoolean();

        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        System.out.println("Luas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getColor());
        System.out.println("Terisi: " + segitiga.isFilled());
        System.out.println(segitiga.toString());

        input.close();
    
    }
    
}
