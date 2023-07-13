class Girias {


static String electronicDevices[]={"refrigerator","Washing Machine","TV","LED","Grinder","AC","Iron Box","Microwave"};
  
  
 static double  PriceOfelectronicDevices[]={2000.89,30000.77,50000,35000.45,48000.23,25000.45,2000.8,4000.78};
 public static void main(String arg[]){
  
 
  System.out.println(electronicDevices[0] +""+electronicDevices[1]);
  System.out.println("List of Electronic Devices Are:");
  
  System.out.println(PriceOfelectronicDevices +""+PriceOfelectronicDevices[1]);
         System.out.println("Price of Electronic Devices Are:");
		  getelectronicDevices();
  getPriceOfelectronicDevices();
  
 }
  
   
   
		public static void getelectronicDevices(){
			
		System.out.println("getelectronicDevices");
		
		for(String electronicDevice:electronicDevices){
  
        System.out.println(electronicDevice);
		}
		}
		
		
		
		 
		 public static void getPriceOfelectronicDevices(){
			 System.out.println("getPriceOfelectronicDevices");
		 
  
		for(double PriceOfelectronicDevice:PriceOfelectronicDevices){
  
        System.out.println(PriceOfelectronicDevice);
		}
  }
     
        
  
   }
 
 
 
