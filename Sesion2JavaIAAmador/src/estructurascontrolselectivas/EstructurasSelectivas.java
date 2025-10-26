package estructurascontrolselectivas;

public class EstructurasSelectivas
{//Inicia clase   
    //Metodo para conocer la estructura de control selectiva if
    //Evaluamos la variable
    public void selectivaIf()
    {
        //Declaracion de variable inicializada 
        double calificacion = 9.5;
        
        //Se evalua la variable
        if (calificacion >= 6.0)
        {//Para condicion verdadera
            
            System.out.println("Aprobado, tienes calificacion: " + calificacion);
            
        }
        else
        {//Para condicion falsa
            
            System.out.println("REPROBADO, tienes calificacion: " + calificacion);
            
        }//Termina else
    }
    
    //Metodo-funcion para conocer la estructura de control selectiva switch
    //Evaluamos el valor de la variable
    public void selectivaSwitch()
    {//Inicia funcion switch
        
        int dia = 2;
        
        switch (dia)
        {//Inicia switch

            case 1: System.out.println("Seleccionaste 1. Dia Lunes"); break;
            case 2: System.out.println("Seleccionaste 2. Dia Martes"); break;
            case 3: System.out.println("Seleccionaste 3. Dia Miercoles"); break;
            case 4: System.out.println("Seleccionaste 4. Dia Jueves"); break;
            case 5: System.out.println("Seleccionaste 5. Dia Viernes"); break;
            default: System.out.println("Opcion invalida tengo solo 1, 2, 3, 4 y 5"); break;
                
        }//Termina switch
    }//Termina funcion switch   
}//Termina clase
