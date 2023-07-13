class WashingMachine{

    static String  name = "IBM";
	
	    static int minSpeed;
	   static  int currentSpeed;
	   static int maxSpeed=30;
	    static boolean isConnected;
	   
	   
    
	public static boolean onOrOff(){
	System.out.println("WashingMachine name is :" + name);
	System.out.println("Invoking onOrOff");
	System.out.println("Parameter"+ 0);
	if(isConnected==false){
	  isConnected=true;
	  System.out.println("the WashingMachine on...");
	}else if(isConnected==true){
	isConnected=false;
	System.out.println("the WashingMachine off...");
	
	}
	return isConnected;
	
	
	}
     public static void increaseSpeed(){
		 System.out.println("Invoking increaseSpeed");
	System.out.println("Parameter"+ 2);
		 
		 if(isConnected==true){
			 if(currentSpeed<maxSpeed){
				 currentSpeed = currentSpeed+1;
				 System.out.println("The Current Speed is"+currentSpeed);
		 }else{
			  System.out.println("Maximum Speed reached");
		 }
		 
		 }else{
			 System.out.println("WashingMachine connect maadu firstu");
			 
			 
			  }
			  System.out.println("End of increaseSpeed");
		}
		public static void decreaseSpeed(){
			System.out.println("Invoking decreaseSpeed");
	System.out.println("Parameter"+ 2);
			
			if(isConnected==true){
				if(currentSpeed>minSpeed){
					currentSpeed= currentSpeed-1;
					System.out.println("The Current Speed is"+currentSpeed);
					
				}else{
					System.out.println("Minimum Speed reached");
				}
			}else{ 
			  System.out.println("the Speed is decreased");
			
			}
			System.out.println("the End of decreaseSpeed");
		}
}