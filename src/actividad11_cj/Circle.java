/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11_cj;

/**
 *
 * @author juanc
 */
public class Circle implements Shape{

    @Override
    public double getArea(int width, int height) {
        return (Math.sqrt((Math.PI * width)));
    }

    @Override
    public double getPerimeter(int width, int height) {
        return ((2*3.14)*width);
    }
    
}
