public class Vehicle  {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (shared among all instances)
    private static double registrationFee = 5000.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : ₹" + registrationFee);
        System.out.println();
    }

}