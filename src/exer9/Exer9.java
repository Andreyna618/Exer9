
package exer9;

import java.util.Scanner;


public class Exer9 {
    
/*Area do trapézio*/
   
    public static void main(String[] args) {
        Scanner leia;
        leia = new Scanner (System.in);
        
        float base_maior;
        float base_menor;
        float altura;
        float resultado;
        
        System.out.println("base maior do trapézio");
        base_maior = Float.parseFloat(leia.nextLine());
        
        System.out.println("base menor do trapézio"); 
        base_menor = Float.parseFloat(leia.nextLine());
        
        System.out.println("altura do trapézio");
        altura = Float.parseFloat(leia.nextLine());
        
        resultado = (base_maior + base_menor) * altura / 2;
        System.out.println("a area do trapézio" + "="+ resultado);
        
    }
    
}
