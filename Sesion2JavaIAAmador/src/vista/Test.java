package vista;
import estructurascontrolselectivas.EstructurasSelectivas;
import estructurascontroliterativas.EstructutrasIterativas;
import java.util.Scanner;

public class Test
{//Inicia programa
    
    
    //El metodo static permite metodos generales para llamarlo en cualquier clase o metodo
    public static void menuGeneral()
    {//Inicia metodo menu
        
        //Declaramos una variable global
        //VARIABLE GLOBAL: Tiene alcance en todo los metodo y estructuras de control
        int menu;
        
        do
        {//Inicia do-while para realizar - ciclar
            
            System.out.println("Menu Estructuras de Control Amador"
                                + "\nSelecciona"
                                + "\n1. Selectivas"
                                + "\n2. Iterativas"
                                + "\n3. Salir");        

            //Objeto para capturar valores desde teclado
            Scanner entradaMenu = new Scanner(System.in);
            //Guarda la opcion capturada en tipo de dato entero
            menu = entradaMenu.nextInt();

            switch (menu)
            {//Inicia switch

                case 1: 

                    //Llamada al metodo selectivaIf() por medio de un objeto apuntador "a"
                    //Cada clase ocupa un APUNTADOR DIFERENTE
                    EstructurasSelectivas a = new EstructurasSelectivas();
                    //Invocacion de metodo
                    a.selectivaIf();

                    //Invocacion de metodo 
                    a.selectivaSwitch();
                    break;

                case 2: 

                    //Llamada del metodo iterativoFor() por medio de un objeto apuntador "b"
                    EstructutrasIterativas b = new EstructutrasIterativas();

                    //Invocamos metodo
                    b.iterativaFor();

                    //Invocamos metodo
                    b.estructuraForEach();

                    //Invocamos metodo
                    b.estructuraWhile();
                    break;

                case 3: 

                    System.out.println("Finalizo el programa!!!!!");
                    break;

                default: 

                    System.out.println("Opcion invalida, solo tengo 1, 2 y 3!");
                    break;

            }//Termina switch
            
        }while(menu != 3);//Termina do-while
         
        
    }//Termina metodo menu



    //La funcion main sirve para llamar metodos-ejecutar
    public static void main(String[] args)
    {//Inica main
        
        menuGeneral();
        
    }//Termina main
    
}//Termina programa
