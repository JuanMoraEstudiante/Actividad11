/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11_cj;

import java.util.Scanner;


public class Actividad11_CJ {

    public static int desplegarMenu(){
        
        int opcion;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("###########Menú###########");
        System.out.println("# 1. Triangulo equilatero#");
        System.out.println("# 2. Cuadrado            #");
        System.out.println("# 3. Circulo             #");
        System.out.println("##########################");
        
        try{
            opcion = sc.nextInt();
        }catch(Exception e){
            System.out.println("Elige una opción valida del menú.");
            return desplegarMenu();
        }
        
        if(opcion < 1 && opcion>3){
            return desplegarMenu();
        }
        
        return opcion;
    }
    
   public static int desplegarMenuOperacion(){
       int opcion;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("###########Menú###########");
        System.out.println("# 1. Perimetro           #");
        System.out.println("# 2. Área                #");
        System.out.println("##########################");
        
        try{
            opcion = sc.nextInt();
        }catch(Exception e){
            System.out.println("Elige una opción valida del menú.");
            return desplegarMenuOperacion();
        }
        
        if(opcion < 1 && opcion>2){
            return desplegarMenuOperacion();
        }
        
        return opcion;
   }
    
    
    public static void main(String[] args) {
        
        //Variables
        boolean exitApp = false;
        int opcion, operacion, w, h;
        Scanner width = new Scanner(System.in);
        Scanner height = new Scanner(System.in);
        Scanner continuar = new Scanner(System.in);
        
        //Desarrollo
        do{
            opcion = desplegarMenu();
        
            switch(opcion){
                case 1: System.out.println("Digite el ancho de su triangulo.");
                        w = width.nextInt();
                        System.out.println("Digite la altura de su triangulo.");
                        h = height.nextInt();
                        operacion = desplegarMenuOperacion();
                        if(operacion == 1){
                            System.out.println(new Triangulo().getPerimeter(w, h));
                        }else{
                            System.out.println(new Triangulo().getArea(w, h));
                        }
                    break;
                case 2: System.out.println("Digite el tamaño del lado de su cuadrado.");
                        w = width.nextInt();
                        operacion = desplegarMenuOperacion();
                        if(operacion == 1){
                            System.out.println(new Square().getPerimeter(w, 0));
                        }else{
                            System.out.println(new Square().getArea(w, 0));
                        }
                    break;
                case 3: System.out.println("Digite el radio de su circulo.");
                        w = width.nextInt();
                        operacion = desplegarMenuOperacion();
                        if(operacion == 1){
                            System.out.println(new Circle().getPerimeter(w, 0));
                        }else{
                            System.out.println(new Circle().getArea(w, 0));
                        }
                    break;
            }
            
            System.out.println("¿Desea hacer otra operación? (Si = 1, No = 2)");
            if(continuar.nextInt() == 2){
                exitApp = true;
            }
            
        }while(exitApp == false);
        
        System.out.println("Adios!");
        
    }
    
}
