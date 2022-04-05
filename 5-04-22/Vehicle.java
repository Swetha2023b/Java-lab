class VehicleNew{  
	int vehicleId;  
	String vehicleName;  
 
	VehicleNew(int id, String n){  
		vehicleId = id;  
		vehicleName = n;  
	}  
	void display(){  
		System.out.print("Vehicle Id = "+ vehicleId + "  " + " Vehicle Name = "+ vehicleName);  
		System.out.println();  
	}  
}  

public class Vehicle{  
	public static void main(String args[]){  
		VehicleNew[] obj = new VehicleNew[5] ;  
		obj[0] = new VehicleNew(12345,"Bullet");  
		obj[1] = new VehicleNew(74656,"Honda City");  
		obj[2] = new VehicleNew(85334,"BMW");  
		obj[3] = new VehicleNew(23678,"Benz");  
		obj[4] = new VehicleNew(85649,"Maruti 800");  
		System.out.println("\n\nVehicle Names\n");
		System.out.println("Vehicle 1:");  
		obj[0].display();  
		System.out.println("Vehicle 2:");  
		obj[1].display();  
		System.out.println("Vehicle 3:");  
		obj[2].display();  
		System.out.println("Vehicle 4:");  
		obj[3].display();  
		System.out.println("Vehicle 5:");  
		obj[4].display();  
	}  
}