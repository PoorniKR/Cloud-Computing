import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            ICalc calc = new MyCalc();
            
            Registry registry = LocateRegistry.createRegistry(1099);  
            registry.bind("CalcService", calc);

            System.out.println("RMI Server is ready...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
