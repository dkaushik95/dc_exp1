import java.rmi.Naming;

/**
 * Created by dishantkaushik on 29/07/16.
 */
public class Client {
    public static void main(String[] args) {
        try {
            ClientInterface clientInterface = (ClientInterface) Naming.lookup("rmi://localhost:5000/try1");
            System.out.println(clientInterface.add(5,2));
            System.out.println(clientInterface.divide(9,3));
            System.out.println(clientInterface.multiply(2,2));
            System.out.println(clientInterface.subtract(5,3));
        }
        catch (Exception E){
            System.out.println(E.toString());
        }
    }
}
