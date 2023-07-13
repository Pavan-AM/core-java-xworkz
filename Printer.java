class Printer {
    static String brand;
    static String model;
    static int price;
    static String color;
    static String connectivity;

    public static void main(String[] args) {
		
	 brand = "Epson";
     model = "WorkForce Pro WF-4740";
     price = 300;
     color = "Black";
     connectivity = "Ethernet, USB, Wi-Fi";
	
	
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Connectivity: " + connectivity);
    }
}