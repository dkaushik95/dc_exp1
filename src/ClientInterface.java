import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by dishantkaushik on 29/07/16.
 */
public interface ClientInterface extends Remote {
    int add(int a, int b) throws RemoteException;
    int subtract(int a, int b) throws RemoteException;
    int multiply(int a, int b) throws RemoteException;
    int divide(int a, int b) throws RemoteException;
}
