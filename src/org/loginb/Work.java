package org.loginb;

 class Work implements Industry, Office {

	 public void employee() {
		String name = "mani";
	System.out.println("employee name is "+ name);
	workers();
	trainee();
	}

		 public void workers() {
		int no = 100;
		System.out.println("workers count is "+ no);
	}
		static void trainee() {
         int count = 20;
         System.out.println("trainee count is "+ count);
		 }
	public static void main(String[] args) {
		Work n = new Work();
		
	n.employee();
		
		
	}
	 

}

