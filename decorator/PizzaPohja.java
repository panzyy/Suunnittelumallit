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
public class PizzaPohja implements Pizza{
    private double hinta;

    public PizzaPohja() {
        this.hinta = 4.0;
    }

    @Override
    public double getHinta() {
        return hinta;
    }


    @Override
    public String getSisalto() {
        return "Pohja";
    }


    
}
