package sef.module10.sample;
//Needs to be completed
//1 - implement Runnable interface
class MyThread1 {
	
	//2 - override run method
	 {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread Name  :"
					+ Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}


