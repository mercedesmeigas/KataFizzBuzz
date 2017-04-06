/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katafizzbuzz;

/**
 *
 * @author dam107
 */
public class FizzBuzz {
    
    public String getFizzBuzz(int n){
        String resultado=String.valueOf(n); 
        String textoNumero = resultado;

        
        if(textoNumero.contains("3")){
            resultado = "Fizz";
        }
        if(textoNumero.contains("5")){
            resultado = "Buzz";
        }
        if (n%3==0 && n%5==0){
            resultado = "FizzBuzz";


        
        // Comprobamos si contiene número.
        if(textoNumero.contains("7")){
            resultado = "Rezz";
        }
        
        // Comprobamos si es múltiplo de número.
        if (n%7==0) {
            resultado = "Rezz";

        }
        

        if(textoNumero.contains("3")){
            resultado = "Fizz";
        }
        if (n%3==0){
            resultado = "Fizz";
        }
        

        return resultado;
        
        
    }
}
