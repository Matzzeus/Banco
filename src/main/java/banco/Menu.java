
package banco;

import java.util.Scanner;



public class Menu {
    static Scanner src = new Scanner(System.in); 
            metodos  Registrar_datos = new metodos();
            int menu ;
            
   public void escoger_opcion(Datos_cliente user){
    do{
            System.out.println("");
            System.out.println("Bienvenido a tu Banco de confianza");
            System.out.println(" Mostrar = 1");
            System.out.println(" Abonar = 2 ");
            System.out.println(" Debitar = 3 ");
            System.out.println("salir = 4 ");
            System.out.println("");
          
            menu = Registrar_datos.incerteNumero("escojer opcion");
            
          switch(menu){
              case 1: 
                  
                  break;
              case 2: 
                 
                  break;
              case 3: 
                  
               
                  
                  break;
               case 4: 
                   System.out.println("Gracias su preferencia");
                  break;
                  
          }
        
        
       }
    while(menu != 4 );
    
    
      }
  }  

    