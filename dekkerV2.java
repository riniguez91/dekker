public static void main(String[] args) { 
    // flags para indicar si cada thread esta el la seccion critica
    boolean thread1 = false; 
    boolean thread2 = false; 
  
    startThreads(); 
} 
  
Thread1() { 
    do { 
        // seccion de entrada 
        // espera a que thread2 esté en la sección crítica 
        while (thread2 == true) 
            ; 
  
        // indica que thread1 esta entrando en la sección crítica 
        thread1 = true; 
  
        // sección crítica 
  
        // sección de salida
        // indica que thread1 está saliendo de la sección crítica 
        thread1 = false; 
  
        // sección restante 
  
    } while (completed == false) 
} 
  
Thread2() { 
    do {  
        // seccion de entrada 
        // espera a que thread1 esté en la sección crítica
        while (thread1 == true) 
            ; 
  
        // indica que thread2 esta entrando en la sección crítica 
        thread2 = true; 
  
        // sección crítica 
  
        // sección de salida
        // indica que thread2 está saliendo de la sección crítica 
        thread2 = false; 
  
        // sección restante
  
    } while (completed == false) 
} 
