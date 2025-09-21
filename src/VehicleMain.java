public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(
            "V001", 
            "Toyota Camry", 
            "Camry", 
            2023, 
            "Toyota", 
            35000.0
        );
        
        System.out.println("=== Vehicle Information ===");
        System.out.println("Vehicle ID: " + vehicle.getVehicleId());
        System.out.println("Name: " + vehicle.getName());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year: " + vehicle.getYear());
        System.out.println("Manufacturer: " + vehicle.getManufacturer());
        System.out.println("Price: $" + String.format("%.2f", vehicle.getPrice()));
        System.out.println("===========================");
    }
}