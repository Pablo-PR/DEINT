/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class Calculadora {
    private int num1;
    private int num2;
    
    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int sumar(){
        return num1 + num2;
    }
    
    public int restar(){
        return num1 - num2;
    }
    
    public int multiplicar(){
        return num1 * num2;
    }
}
