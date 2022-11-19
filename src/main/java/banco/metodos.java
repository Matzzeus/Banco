
package banco;

import java.util.Scanner;

public class metodos {
    Scanner scanner;
    
     public metodos() {

        scanner = new Scanner(System.in);
    }

    public String incerteLetras(String titulo) {
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = scanner.nextLine();
            if(!n.matches("[A-Za-z ]*$")){
                n = "";

            }

        }

        return n;

    }

     
    public int incerteNumero(String titulo) {
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = scanner.nextLine();
            if(!n.matches("[0-9]*$")){
                n = "";

            }

        }

        return Integer.parseInt(n);

    }


    public int incerteNumeroconParametro(String titulo, int l) {
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = scanner.nextLine();
            if(!n.matches("[1-" + l +" ]*$")){
                n = "";

            }

        }

        return Integer.parseInt(n);

    }
    
    
    
}

    

