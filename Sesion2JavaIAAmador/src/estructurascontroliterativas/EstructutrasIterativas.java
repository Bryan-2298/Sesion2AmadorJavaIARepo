package estructurascontroliterativas;

public class EstructutrasIterativas
{//Inicia clase
    
    //Estructura for nace en 1972
    //Metodo-funcion estructura de control for para imprimir el abecedario
    public void iterativaFor()
    {//Inicia metodo
        
        //El ciclo recorrera todo el abecedario desde a hasta z
        for (char letra = 'a'; letra <= 'z'; letra++)
        {//Inicia for
            
            System.out.println("Letra es: " + letra);
            
        }//Termina for
        
    }//Termina metodo
    
    //Estructura foreach nace en 1995
    //Metodo-funcion estructura de control foreach para imprimir datos de un arreglo
    //Arreglo es un tipo de dato que permite almacenar millones de valores
    public void estructuraForEach()
    {//Inica metodo
        
        //Declaracion de un arreglo de tipo entero, los arreglos tienen indexacion
        //INDEXACION: Comenzar a contar desde cero desde la primer posicion
        int arregloNumeros[] = {3, 2, 100, 500, 1};
        
        
        //Se empieza a leer de derecha a izquierda: arregloNumeros pasa sus valores a arregloNumero
        for (int arregloNumero : arregloNumeros)
        {//Inicia foreach
            
            System.out.println("Cantidad arreglo es: " + arregloNumero);
            
        }//Termina foreach
        
    }//Termina metodo
    
    //Metodo-funcion estructura de control while, repite hasta que se cumpla una condicion
    public void estructuraWhile()
    {//Inicia metodo
            
        //Variable de tipo entero inicializada en uno
        int contador = 1;
        
        while (contador <= 5)
        {//Inicia while            
            
            System.out.println("Numero es con while: " + contador);
            //Contador incrementado en uno por cada ciclo en unidad
            contador++;
            
        }//Termina while
            
    }//Termina metodo

}//Termina clase
