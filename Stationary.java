class Stationary{

static String stationaryItems[]={null,null,null,null,null,null,null,null};
 static int index;
 
 public static boolean addstationaryItems(String itemName){
 System.out.println("Invoking addstationaryItems");
 boolean isAdded=false;
 if(itemName!=null){
   stationaryItems[index]=itemName;
   index++;
   isAdded=true;
 
 }else{
  System.out.println("the item name cannot be null");
 }
 
 return isAdded;
 }
 

public static void getstationaryItems(){

for(int i=0;i<stationaryItems.length;i++){
String ref=stationaryItems[i];
System.out.println("The stationary item name is :"+ref);

}
}
public static boolean updatestationaryItems(String existingitemNames,String updateditemNames){

System.out.println("Invoking updating operation");
boolean isupdated=false;
for(int i=0;i<stationaryItems.length;i++){
if(stationaryItems[i].equals (existingitemNames)){
stationaryItems[i]=updateditemNames;
isupdated=true;
}
}
return isupdated;

}
}