/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class CalculadoraB {
    private float num1;
    private float num2;
    
    public CalculadoraB(float num1, float num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public float sumar(){
        return num1 + num2;
    }
    
    public float restar(){
        return num1 - num2;
    }
    
    public float multiplicar(){
        return num1 * num2;
    }
}
