class Car1{
    static String brand;
    static String model;
    static int price;
    static String color;
    static int year;

    public static void main(String[] args) {
	 brand = "Toyota";
     model = "Camry";
     price = 25000;
     color = "Silver";
     year = 2022;
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}