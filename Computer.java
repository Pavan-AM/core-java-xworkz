class Computer {
    static String brand;
    static String model;
    static String processor;
    static int memory;
    static int storage;
    static String operatingSystem;

    public static void main(String[] args) {
		brand = "lenova";
        model = "Inspiron";
        processor = "Intel Core i5";
        memory = 8;
        storage = 512;
        operatingSystem = "Windows 10";
		
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("Memory: " + memory +);
        System.out.println("Storage: " + storage +);
        System.out.println("Operating System: " + operatingSystem);
    }
}