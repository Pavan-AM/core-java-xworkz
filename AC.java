class AC{

    static String  name = "Samsung";
	
	   static int minTemp;
	   static  int currentTemp;
	   static int maxTemp=30;
	    static boolean isConnected;
	   
	   
    
	public static boolean onOrOff(){
	System.out.println("AC name is :" + name);
	System.out.println("Invoking onOrOff");
	System.out.println("Parameter"+ 0);
	if(isConnected==false){
	  isConnected=true;
	  System.out.println("the AC on...");
	}else if(isConnected==true){
	isConnected=false;
	System.out.println("the AC off...");
	
	}
	return isConnected;
	
	
	}
     public static void increaseTemp(){
		 System.out.println("Invoking increaseTemp");
	System.out.println("Parameter"+ 2);
		 
		 if(isConnected==true){
			 if(currentTemp<maxTemp){
				 currentTemp = currentTemp+1;
				 System.out.println("The Current Temp is"+currentTemp);
		 }else{
			  System.out.println("Maximum Temp reached");
		 }
		 
		 }else{
			 System.out.println("AC connect maadu firstu");
			 
			 
			  }
			  System.out.println("End of increaseTemp");
		}
		public static void decreaseTemp(){
			System.out.println("Invoking decreaseTemp");
	System.out.println("Parameter"+ 2);
			
			if(isConnected==true){
				if(currentTemp>minTemp){
					currentTemp= currentTemp-1;
					System.out.println("The Current Temp is"+currentTemp);
					
				}else{
					System.out.println("Minimum Temp reached");
				}
			}else{ 
			  System.out.println("the Temp is decreased");
			
			}
			System.out.println("the End of decreaseTemp");
		}
}
			