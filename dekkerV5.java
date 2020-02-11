Main() 
{ 
	// para saber que hilo entrara despues
	int favouredthread = 1; 
  // se activa si cada hilo esta en la cola para entrar
  // en su seccion critica
	boolean thread1wantstoenter = false; 
	boolean thread2wantstoenter = false;
	startThreads(); 
} 
Thread1() 
{ 
	do { 
		thread1wantstoenter = true; 
		// punto de entrada 
		// espera hasta que el hilo 2 quiere entrar 
		// a su seccion critica 
		while (thread2wantstoenter == true) { 
			// si el segundo es mas favorable 
			if (favaouredthread == 2) { 
				// le da acceso al otro hilo 
				thread1wantstoenter = false; 
				// espera hasta que el siguiente es favorecido
				while (favouredthread == 2) 
					; 
				thread1wantstoenter = true; 
			} 
		} 
		// seccion critica
		// favorece el segundo
		favouredthread = 2; 
		// sale de la seccion
		// indica que se ha terminado  
		// su seccion critica 
		thread1wantstoenter = false; 
		// seccion para recordar
	} while (completed == false) 
} 
Thread2() 
{ 
	do { 
		thread2wantstoenter = true; 
		// punto de entrada 
		// espera hasta que el hilo 1 quiere entrar 
		// a su seccion critica 
		while (thread1wantstoenter == true) { 
			// si el primero es mas favorable 
			if (favaouredthread == 1) { 
				// le da acceso al otro hilo
				thread2wantstoenter = false; 
				// espera a que sea favorecido 
				while (favouredthread == 1) 
					; 
				thread2wantstoenter = true; 
			} 
		} 
		// critical section 
		// favour the 1st thread 
		favouredthread = 1; 
		// sale de la seccion
		// indica que se ha terminado  
		// su seccion critica
		thread2wantstoenter = false; 
		// seccion para recordar
	} while (completed == false) 
} 
