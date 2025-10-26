package estructuradedatos;
import java.util.ArrayList;

public class ArrayList1
{
    public static void main(String[] args)
    {
        //Estructura de datos ArrayList
        ArrayList<String> listaNombres = new ArrayList<>();
        
        listaNombres.add("Adrian");
        listaNombres.add("Bryan");
        listaNombres.add("Christian");
        listaNombres.add("Nestor");
        listaNombres.add("Felix");
        listaNombres.add("Gabriel");
        listaNombres.add("Jose");
        listaNombres.add("Tere");
        
        for (String listaNombre : listaNombres)
        {
            //Siempre se manda a llamar al de la izquierda
            System.out.println("Nombre: " + listaNombre + "!!!");
        }
        
    }
}