Main() 
{ 
	// flag que indica si cada thread está 
	// en la cola de entrada de la sección crítica
	boolean thread1wantstoenter = false; 
	boolean thread2wantstoenter = false; 
	startThreads(); 
} 
Thread1() 
{ 
	do { 
		thread1wantstoenter = true; 
		// entrada a la sección crítica 
		// espera hasta que thread2 quiera entrar
		// es la sección crítica 
		while (thread2wantstoenter == true) ; 

		// Sección crítica 

		// salida de la sección Crítica
		// indica que thread1 se ha completado
		// es sección crítica
		thread1wantstoenter = false; 
		// sección resatnte

	} while (completed == false) 
} 
Thread2() 
{ 
	do { 
		thread2wantstoenter = true;
		// entrada a la sección 
		// esperar hasta que thread1 quiera entrar
		// es la sección crítica 
		while (thread1wantstoenter == true) ; 

		// sección Crítica

		// salida de la sección
		// indica que thread2 se ha completado
		// es sección crítica
		thread2wantstoenter = false; 
		// sección restante

	} while (completed == false) 
} 

