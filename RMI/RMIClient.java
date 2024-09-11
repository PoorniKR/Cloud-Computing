import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            ICalc calc = (ICalc) registry.lookup("CalcService");

            int sum = calc.add(5, 3);
            int diff = calc.subtract(5, 3);

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + diff);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
