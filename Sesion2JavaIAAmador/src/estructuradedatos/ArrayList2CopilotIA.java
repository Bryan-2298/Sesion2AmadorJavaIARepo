package estructuradedatos;
import java.util.ArrayList;
import java.util.List;

public class ArrayList2CopilotIA
{//Inica clase
    
    public static final String SUFIJO = "!!!";
    
    public static void main(String[] args)
    {//Inicia main
        
        List<String> nombres = new ArrayList<>(List.of(
                                                        "Adrian", 
                                                        "Bryan", 
                                                        "Christian", 
                                                        "Nestor", 
                                                        "Felix", 
                                                        "Gabriel", 
                                                        "Jose", 
                                                        "Tere"
                                                       ));
        
        for (String nombre : nombres)
        {
            System.out.println("Nombre: " + nombre + SUFIJO);
        }
        
    }//Termina main
    
}//Termina clase
