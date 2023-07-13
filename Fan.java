class Fan {
    static String brand;
    static int numberOfBlades;
    static int speed;
    static boolean isRemoteControlled;
    static String color;

    public static void main(String[] args) {
		
		  brand = "Hunter";
         numberOfBlades = 3;
         speed = 2;
        isRemoteControlled = true;
        color = "White";
		
		
        System.out.println("Brand: " + brand);
        System.out.println("Number of Blades: " + numberOfBlades);
        System.out.println("Speed: " + speed);
        System.out.println("Remote Controlled: " + isRemoteControlled);
        System.out.println("Color: " + color);
    }
}