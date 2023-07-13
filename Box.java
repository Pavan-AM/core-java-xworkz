class Box {
    static String brand;
    static int length;
    static int width;
    static int height;
    static String color;

    public static void main(String[] args) {
		
		 brand = "Cardboard Inc.";
         length = 10;
         width = 8;
         height = 6;
         color = "Brown";
		
        System.out.println("Brand: " + brand);
        System.out.println("Dimensions: " + length + " x " + width + " x " + height + " inches");
        System.out.println("Color: " + color);
    }
}