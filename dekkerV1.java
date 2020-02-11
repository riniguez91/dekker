public static void main(String[] args) 
{ 
	int thread_number = 1; 
	startThreads(); 
} 

Thread1() 
{ 
	do { 
		// seccion de entrada 
    
		// espera hasta que threadnumber sea 1
		while (threadnumber == 2) 
			; 
		// seccion critica 
    
		// seccion de salida 
    
		// damos acceso al otro thread 
		threadnumber = 2; 
		// seccion restante 
	} while (completed == false) 
} 

Thread2() 
{ 
	do { 
		// seccion de entrada 
    
		// espera hasta que threadnumber sea 2
		while (threadnumber == 1) 
			; 
		// seccion critica 
    
		// seccion de salida 
    
		// damos acceso al otro thread 
		threadnumber = 1; 
		// seccion restante
	} while (completed == false) 
} 
