class TV {
    static String brand;
    static String model;
    static int price;
    static int screenSize;
    static String resolution;

    public static void main(String[] args) {
	brand = "Samsung";
    model = "Smart TV";
    price = 500;
    screenSize = 55;
    resolution = "4K";
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Resolution: " + resolution);
    }
}