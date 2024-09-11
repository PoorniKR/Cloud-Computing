import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyCalc extends UnicastRemoteObject implements ICalc {
    protected MyCalc() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
        return a - b;
    }
}
