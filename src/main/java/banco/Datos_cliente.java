

package banco;


public class Datos_cliente {
   
   String nombre;
   int edad;
   
 
       
   metodos Registrar_datos = new metodos();
  
   public void datoscliente() {
   nombre = Registrar_datos.incerteLetras("Ingrese su nombre");
   
   edad = Registrar_datos.incerteNumero("Ingrese su edad");
       System.out.println("");
       System.out.println("Bienvenido "+ nombre);
      
       System.out.println("Su edad es: " + edad);
       System.out.println("");
}
   
  }  
    
    
   
