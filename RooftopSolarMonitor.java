import java.util.Scanner;

class RooftopSolarMonitor {
    
    
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int panelId = 12;
        double energy = 14.5;
        int panels = 5;
        char status = 'Y';

        System.out.println(panelId);
        System.out.println(energy);
        System.out.println(panels);
        System.out.println(status);

        
        System.out.println("Enter energy:");
        double e = scanner.nextDouble();

        if (e >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        
        System.out.println("Enter morning energy:");
        double m = scanner.nextDouble();
        
        System.out.println("Enter evening energy:");
        double ev = scanner.nextDouble();

        double total = calculateTotalEnergy(m, ev);
        System.out.println(total);
    }
}