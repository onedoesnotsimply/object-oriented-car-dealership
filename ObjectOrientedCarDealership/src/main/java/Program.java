import com.pluralsight.*;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Dealership dBUsedCars = DealershipFileManager.getDealership();



        for (Vehicle vehicle : dBUsedCars.getAllVehicles()) {
            System.out.println(vehicle);
        }
    }
}
