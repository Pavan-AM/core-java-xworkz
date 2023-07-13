class TeleComm{

static String simNames[]={null,null,null,null,null,null,null};
static int index;

public static  boolean isStored(String sim){

 boolean isStored=false;
 
 if(sim !=null){
  simNames[index]=sim;
   index++;
   isStored=true;
 }else{
   System.out.println("The sim name cannot be null");
 
 }
 return isStored;

}

public static void getsimNames(){

System.out.println(" Invoking the getsimNames");

for(int sim=0; sim<simNames.length;sim++){

 String reference=simNames[sim];
 
 System.out.println("The simcard name is "+reference);

}
}

public static boolean updatesimNames(String existingsimNames,String updatedsimNames){
	
	System.out.println("Invoking of Update operation");
	boolean isUpdated=false;
	for( int simIndex=0;simIndex<simNames.length;simIndex++){
		if(simNames[simIndex].equals(existingsimNames)){
			simNames[simIndex]=updatedsimNames;
			isUpdated=true;
			}
		}
		return isUpdated;
}


}