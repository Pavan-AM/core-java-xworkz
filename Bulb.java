class Bulb {
    static String brand;
    static String type;
    static int wattage;
    static String colorTemperature;
    static boolean dimmable;

    public static void main(String[] args) {
		
	 brand = "cormpton";
     type = "LED";
     wattage = 9;
     colorTemperature = "Soft White";
     dimmable = true;
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Wattage: " + wattage + "W");
        System.out.println("Color Temperature: " + colorTemperature);
        System.out.println("Dimmable: " + dimmable);
    }
}