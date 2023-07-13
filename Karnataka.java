class Karnataka{
    
	 static String cityNames[]={null,null,null,null,null,null,null};
	 static int index;
	 public static boolean savecities(String city){
	 
	 boolean isSaved=false;
	 if(cityNames.length>index){
	 
	 if(city != null){
	  cityNames[index]=city;
	  index++;
	  isSaved=true; 
	 /* System.out.println("The city name is added");*/
	 }else{
	 
	 System.out.println("the city name is not should be null");
	 }
	 }else{
		 System.out.println("The size of array gets exeded");
	 }
	 return isSaved;
	 }
	 
	 public static void getcityNames(){
	 System.out.println("Invoking the getcityNames");
	 
	for( int city=0; city<cityNames.length; city++){
	 
	 String reference= cityNames[city];
	 System.out.println("the city name is "+reference);
	 }
 }
    public static boolean updateCityName(String existingCityName,String UpdatedCityName){
		System.out.println("Invoking Update operation");
	 boolean isUpdated=false;
	 for(int cityIndex=0;cityIndex<cityNames.length;cityIndex++){
		 if(cityNames[cityIndex].equals(existingCityName)){
			 cityNames[cityIndex]=UpdatedCityName;
		 isUpdated=true;
	 }
	 
	 
	 }	
	 return isUpdated;
	}
  
  public static String searchcityNames(String cityName){
	 System.out.println("Invoking the getcityNames");
	 String sName=null;
	for(String cName=cityNames){
	 if(cName.equals(cityName)){
		 sName=cName;
		 System.out.println("The city name is found");
		 
	 }
	 	 return cName;

	 }
 }
 }