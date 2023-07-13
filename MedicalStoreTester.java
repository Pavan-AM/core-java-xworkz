class MedicalStoreTester{

  public static void main(String Medicine[]){
  
  MedicalStore1.isLoaded("Aspirin");
  MedicalStore1.isLoaded("Dolo 650");
  MedicalStore1.isLoaded("Zincovit Tablet");
  MedicalStore1.isLoaded("Becosules capsule");
  MedicalStore1.isLoaded("folvite tablet");
  MedicalStore1.isLoaded("Dulcoflex tablet");
  MedicalStore1.isLoaded("KZ Creame");
  MedicalStore1.isLoaded("Emolene Cream");
  MedicalStore1.isLoaded("Glucon-D");
  MedicalStore1.isLoaded("Boro plus Creame");
  
    MedicalStore1.getmedicineNames();
	MedicalStore1.updatemedicineNames("Glucon-D","ORS Powder");
		MedicalStore1.updatemedicineNames("KZ Creame","Burnil Cream");

		MedicalStore1.updatemedicineNames("Dolo 650","Dolo");

	    MedicalStore1.getmedicineNames();

 }

}