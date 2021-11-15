/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectojava01;

import java.util.Scanner;

/**
 *
 * @author Vero
 */
public class ProyectoJava01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese su nombre:");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        
        System.out.println("Ingrese su apellido:");
        String apellido = scanner.next();
        
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();
        
        System.out.println("Ingrese su hobby:");
        String hobby = scanner.next();
        
        System.out.println("Ingrese su ediitor de codigo preferido:");
        String editor = scanner.next();
        
        System.out.println("Ingrese su sistema operativo:");
        String sistema = scanner.next();
        
        
        
        
        
        
        
        System.out.println("Nombre: " + nombre );
        System.out.println("Apellido: "+ apellido );
        System.out.println("Edad: " + edad );
        System.out.println("Hobby: " + hobby );
        System.out.println("Editor de codigo preferido: " + editor );
        System.out.println("Sistema operativo: " + sistema );
                 
            
                 
        
        
        // TODO code application logic here
    }
    
   
    
    
    
    
    
}
