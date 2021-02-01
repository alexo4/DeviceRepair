
package devicerepair;

import java.util.Scanner;


public class DeviceRepair {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        Device myNewDevice = new Device("12345", "Asus", "Alex", "Smashed Screen", "Not started yet", 1);
        
        System.out.println(myNewDevice.toString());
        
        String thing = myNewDevice.toString();
        String[] device = thing.split(", ");
        System.out.println(device[2]);
    }
    
    public static void mainMenu(){
        while(true){
            System.out.println("1.Add new device\n2.Assign the device to a user\n3.Raise issues with a device\n4.Track the repair status of the device\n5.Assign a repair to a technician\n6.Update status of a device\n7.Remove a device from the system\nPlease select an option: ");
            int option = input.nextInt();
            switch(option){
                case 1:
                    addNewDevice();
                    break;
                
                case 2:
                    
                    break;
                
                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
                
                case 5:
                    
                    break;
                    
                case 6:
                    
                    break;
                
                case 7:
                    
                    break;
            }
        }
    }
    
    public static void addNewDevice(){
        
    }
}
