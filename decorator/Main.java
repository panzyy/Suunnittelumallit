/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author panzyy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza pizza1 = new Herkkusieni(new Pinaatti(new Tomaatti(new PizzaPohja())));
        Pizza pizza2 = new Rucola(new Juusto(new Kinkku(new Herkkusieni(new PizzaPohja()))));
        
        System.out.println("Ensimmäisen pizzan hinta: " +pizza1.getHinta()+"e");
        System.out.println("Ensimmäisen pizzan sisältö: " + pizza1.getSisalto());
        
        System.out.println("Toisen pizzan hinta: " +pizza2.getHinta()+"e");
        System.out.println("Toisen Pizzan sisältö: " +pizza2.getSisalto());
        
    }
    
}
