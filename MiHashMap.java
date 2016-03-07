import java.util.Arrays;
/**
 * Write a description of class MiHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashMap

{
    private String key[];

    private int descripcion[];

    /**
     * Constructor for objects of class MiHashMap
     */
    public MiHashMap()
    {
        key = new String [0];
        descripcion = new int [0];
    }     

    /**
     * 
     */
    public int put(String clave, int valor)
    {
        int retorna = -1;
        
        int indexKey = 0; //Indice de claves
        
        int indexDescripcion = 0; // Indice de descripcion
        
        boolean repetido = false; 
        if(key.length == 0 && descripcion.length == 0) // comprobacion si estan vacios los Array
        {
            descripcion = new int[descripcion.length+1];

            key = new String [key.length+1];

            clave = key[indexKey]; 

            valor = descripcion[indexDescripcion];

        }
        else 
        {
            for(int index = 0; index <key.length;index++) //Compruebo si hay alguno repetido
            {
                if(key[index] == clave) //Asigna sobreescribiendo
                {
                    index = retorna;
                    descripcion[index] = valor; 
                    repetido = true;                    
                }                                 
            }
            if (repetido == false){

                String copiaKey[] = new String[key.length + 1];

                int copiaDescripciones[] = new int[descripcion.length +1];

                for(int  index = 0; index < key.length; index++)
                {
                    copiaKey[index] = key[index];

                    copiaDescripciones[index] = descripcion[index];

                    copiaKey[copiaKey.length-1] = clave;

                    copiaDescripciones[copiaDescripciones.length-1] = valor;
                }
                key = copiaKey; // copio los array 
                descripcion = copiaDescripciones;  //Copio los array
            }
        }
        return retorna;
    }

}

