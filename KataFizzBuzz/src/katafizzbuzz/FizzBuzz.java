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
        
        // Comprobamos si contiene número.
        if(textoNumero.contains("7")){
            resultado = "Rezz";
        }
        
        // Comprobamos si es múltiplo de número.
        if (n%7==0) {
            resultado = "Rezz";
        }
        
        return resultado;
        
    }
}
