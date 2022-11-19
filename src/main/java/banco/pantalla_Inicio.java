
package banco;
public class pantalla_Inicio {
    
    public static void main(String[] args) {
        
        int numero;
        
        metodos Registrar_datos = new metodos();
        Datos_cliente user =new Datos_cliente();
        Menu menu = new Menu();
       
        
        System.out.println("..............Binvenido..............");
        
       numero = Registrar_datos.incerteNumero("Acepta terminos y condición del banco 1= si no = presione cualquier numero");
       
       if (numero == 1){
        
       user.datoscliente();
       menu.escoger_opcion(user);
    }
       else {
           System.out.println("Para entrar a la aplicación debe de aceptar Terminos y Condiciones");
       } 
        
    }
       
       
        
    }
    
    
    

