import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by dishantkaushik on 29/07/16.
 */
public class ServerClass extends UnicastRemoteObject implements ClientInterface {

    protected ServerClass() throws RemoteException {
    }

    protected ServerClass(int port) throws RemoteException {
        super(port);
    }

    protected ServerClass(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) throws RemoteException {
        return a*b;
    }

    @Override
    public int divide(int a, int b) throws RemoteException {
        return a/b;
    }
}
