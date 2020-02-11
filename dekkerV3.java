Main() 
{ 

	// flags to indicate if each thread is in 
	// queue to enter its critical section 
	boolean thread1wantstoenter = false; 
	boolean thread2wantstoenter = false; 

	startThreads(); 
} 

Thread1() 
{ 

	do { 

		thread1wantstoenter = true; 

		// entry section 
		// wait until thread2 wants to enter 
		// its critical section 
		while (thread2wantstoenter == true) 
			; 

		// critical section 

		// exit section 
		// indicate thread1 has completed 
		// its critical section 
		thread1wantstoenter = false; 

		// remainder section 

	} while (completed == false) 
} 

Thread2() 
{ 

	do { 

		thread2wantstoenter = true; 

		// entry section 
		// wait until thread1 wants to enter 
		// its critical section 
		while (thread1wantstoenter == true) 
			; 

		// critical section 

		// exit section 
		// indicate thread2 has completed 
		// its critical section 
		thread2wantstoenter = false; 

		// remainder section 

	} while (completed == false) 
} 

