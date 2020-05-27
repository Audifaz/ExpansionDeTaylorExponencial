/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponentialfunctiontayloraproximation;

/**
 *
 * @author maer
 */
import java.util.Scanner;

public class ExponentialFunctionTaylorAproximation {


    public static int factorial(int n){    
        if((n==1)||(n<=0))
            return 1;
        else
            return n*factorial(n-1);
    }

    public static void main(String[] args) {
        double exp;
        int i;
        int aprox=0;
        Scanner stream;
        stream=new Scanner(System.in);
        //
        System.out.print("Ingrese la presición de la funcion exponencial: ");
        aprox=stream.nextInt();
        //
        exp=0;
        if(aprox>0){  

            for(i=0;i<aprox;i++){
            exp=exp+(1.0/factorial(i));
            System.out.println(exp);
            }//End for
    
            
       }//End if
                System.out.println("El resultado final es: "+exp);
    }
    
}
