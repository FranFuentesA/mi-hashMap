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
     * Asocia el valor especificado con la clave especificada. Si la clave existía, entonces sobreescribe su valor y devuelve el valor antiguo. Si no existía devuelve -1.
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

                    copiaKey[copiaKey.length-1] = clave; // resto uno para poder copiar

                    copiaDescripciones[copiaDescripciones.length-1] = valor; // resto uno para poder copiar
                }
                key = copiaKey; // copio los array 
                
                descripcion = copiaDescripciones;  //Copio los array
            }
        }
        return retorna;
    }
    
     /**
     * Devuelve el valor asociado con la clave especificada o -1 en caso de que la clave no exista.     
     */
    public int get(String clave)
    {
        int retorna = -1;
        for(int index=0; index< descripcion.length; index++)
        {
            String buscado = key[index]; 
            if(buscado == clave)
            {
                retorna = descripcion[index];
            }
        }

        return retorna;
    }
}

