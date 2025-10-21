/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testinggit_carmen_gloria;

import java.util.Scanner;

/**
 *
 * @author csoto
 */
public class TestingGit_Carmen_Gloria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            int contador = 0;
        String pass; 
        Scanner objeto_scanner = new Scanner (System.in);
        
        
        //While (condicional)
        // aquí va el código que se ejecuta mientras se cumple la condición
     
    while (contador < 3 ){
        System.out.println(" Escribe  la contraseña");
        pass= objeto_scanner.nextLine();
        if (pass.equals("abc")){
            contador = 3;
            System.out.println("Has entrado");
        } else{
            contador = contador + 1;
            if (contador < 3 ){
                System.out.println("Quedan" + (3-contador));
            }
    }
    
}
    }
}
