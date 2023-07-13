class Speaker{

    static String  name = "JBL";
	
	   static int minVolume;
	   static  int currentVolume;
	   static int maxVolume=10;
	    static boolean isConnected;
	   
	   
    
	public static boolean onOrOff(){
	System.out.println("speaker name is :" + name);
	System.out.println("Invoking onOrOff");
	System.out.println("Parameter"+ 0);
	if(isConnected==false){
	  isConnected=true;
	  System.out.println("the speaker on...");
	}else if(isConnected==true){
	isConnected=false;
	System.out.println("the speaker off...");
	
	}
	return isConnected;
	
	
	}
     public static void increaseVolume(){
		 System.out.println("Invoking increaseVolume");
	System.out.println("Parameter"+ 2);
		 
		 if(isConnected==true){
			 if(currentVolume<maxVolume){
				 currentVolume = currentVolume+1;
				 System.out.println("The Current volume is"+currentVolume);
		 }else{
			  System.out.println("Maximum volume reached");
		 }
		 
		 }else{
			 System.out.println("Speaker connect maadu firstu");
			 
			 
			  }
			  System.out.println("End of increaseVolume");
		}
		public static void decreaseVolume(){
			System.out.println("Invoking decreaseVolume");
	System.out.println("Parameter"+ 2);
			
			if(isConnected==true){
				if(currentVolume>minVolume){
					currentVolume= currentVolume-1;
					System.out.println("The Current volume is"+currentVolume);
					
				}else{
					System.out.println("Minimum Volume reached");
				}
			}else{ 
			  System.out.println("the volume is decreased");
			
			}
			System.out.println("the End of decreaseVolume");
		}
}
			 
			 
			 
			 
			 

 