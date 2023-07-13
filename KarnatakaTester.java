class KarnatakaTester{

public static void main(String city[]){

   Karnataka.savecities("chickaballapur");
   Karnataka.savecities("Banglore");
   Karnataka.savecities("Hubballi");
   Karnataka.savecities("shivamogga");
   Karnataka.savecities("Tumakuru");
   Karnataka.savecities("Hassan");
   Karnataka.savecities("Belgavi");
   Karnataka.savecities("Manglore");
  
  
 String cityName= Karnataka.searchcityNames("Manglore");
 System.out.println("The cityName searched is"+cityName);
   
   Karnataka.getcityNames();
  
   Karnataka.updateCityName("Belgavi","shidlagatta");
      Karnataka.getcityNames();


   
}



}