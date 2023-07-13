class Keypad {
    static String brand;
    static String model;
    static int price;
    static String color;
    static boolean backlit;

    public static void main(String[] args) {
		
     brand = "Razer";
     model = "BlackWidow Elite";
     price = 150;
     color = "Black";
     backlit = true;
	 
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Backlit: " + backlit);
    }
}