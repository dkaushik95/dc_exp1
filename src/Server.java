import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Created by dishantkaushik on 29/07/16.
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerClass serverClass = new ServerClass();
            Naming.rebind("rmi://localhost:5000/try1", serverClass);


        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
