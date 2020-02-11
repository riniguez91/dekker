 // indices para indicar que valor esta dentro
    // cola para entrar en la seccion critica
    boolean proceso_1__entrar = false; 
    boolean proceso_2_entrar = false; 
  
   iniciarprocesos(); 
} 

proceso1() 
{  
    do {  
       proceso_1_entrar = true; 
        while (proceso_2_entrar == true) {  
            //da acceso a otro proceso
           proceso_1_entrar = false; 
           proceso_1_entrar = true; 
        }   
        // entrada a la seccion 
        // espera hasta que el proceso 2 entre  
        // seccion critica  
        // salida de la seccion 
        // indica que el proceso 1 ha terminado
        
       proceso_1_entrar = false; 
    } while (completed == false) 
} 
  
proceso2() 
{ 
  
    do {  
        proceso_2_entrar = true;  
           while (proceso_1_entrar == true) {   
            // se da acceso a otro proceso            
            proceso_2_entrar = false; 
            proceso_2_entrar = true; 
        } 
  
        // entrada de la seccion 
        // se espera a que proceso1 entre   
        // seccion critica  
        //salida de la seccion 
        //el proceso2 ha terminado
        
        proceso_2_entrar = false;  
    } while (completed == false) 
} 
