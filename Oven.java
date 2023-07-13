class Oven{

    static String  name = "Bosch";
	
	   static int minHeat;
	   static  int currentHeat;
	   static int maxHeat=40;
	    static boolean isConnected;
	   
	   
    
	public static boolean onOrOff(){
	System.out.println("Oven name is :" + name);
	System.out.println("Invoking onOrOff");
	System.out.println("Parameter"+ 0);
	if(isConnected==false){
	  isConnected=true;
	  System.out.println("the Oven  on...");
	}else if(isConnected==true){
	isConnected=false;
	System.out.println("the Oven off...");
	
	}
	return isConnected;
	
	
	}
     public static void increaseHeat(){
		 System.out.println("Invoking increaseHeat");
	System.out.println("Parameter"+ 2);
		 
		 if(isConnected==true){
			 if(currentHeat<maxHeat){
				 currentHeat = currentHeat+1;
				 System.out.println("The Current Heat is"+currentHeat);
		 }else{
			  System.out.println("Maximum Heat reached");
		 }
		 
		 }else{
			 System.out.println("Oven connect maadu firstu");
			 
			 
			  }
			  System.out.println("End of increaseHeat");
		}
		public static void decreaseHeat(){
			System.out.println("Invoking decreaseHeat");
	System.out.println("Parameter"+ 2);
			
			if(isConnected==true){
				if(currentHeat>minHeat){
					currentHeat= currentHeat-1;
					System.out.println("The Current Heat is"+currentHeat);
					
				}else{
					System.out.println("Minimum Heat reached");
				}
			}else{ 
			  System.out.println("the Heat is decreased");
			
			}
			System.out.println("the End of decreaseHeat");
		}
}
