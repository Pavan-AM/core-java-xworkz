class MedicalStore1{
 
 static String medicineNames[]={null,null,null,null,null,null,null,null,null,null};
 static int index;
 
 public static boolean isLoaded(String Medicine){
	 boolean isLoaded=false;
	 if(Medicine !=null){
	 medicineNames[index]=Medicine;
	 index++;
	 isLoaded=true;
	 
	 }else{
		 System.out.println("The medicine Name is not loaded");
	 }
	 return isLoaded;
 }
 
 public static void getmedicineNames(){
	 System.out.println("Invoking getmedicineNames");
	 
	 for(int Medicine=0; Medicine< medicineNames.length;Medicine++){
		 String Reference=medicineNames[Medicine];
		 
		 System.out.println("The Medicine name is "+Reference);
	 }
	 
   }
   public static boolean updatemedicineNames(String existingmedicineNames,String updatedmedicineNames){
	System.out.println("Invoking the updating operation");
	boolean isupdated=false;
	for(int i=0;i<medicineNames.length;i++){
		if(medicineNames[i]. equals(existingmedicineNames)){
			medicineNames[i]=updatedmedicineNames;
			isupdated=true;
		}
		
	}
	return isupdated;
	
	
	
}
}