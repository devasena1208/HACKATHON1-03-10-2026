public class TotalEnergy {
    public static void main(String[] args) {
        int panelId = 123;
        double energy = 89.76;
        int noofpanels = 10;
        char status = 'A';
        double morningEnergy = 123.45;
        double eveningEnergy = 50.36;

        public static double total = calculateTotalEnergy(morningEnergy, eveningEnergy);
        System.out.println("Total energy generated: " + total);
    }
}