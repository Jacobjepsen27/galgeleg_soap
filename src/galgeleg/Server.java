/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galgeleg;

//import java.rmi.Naming;
import javax.xml.ws.Endpoint;

/**
 *
 * @author JacobWorckJepsen
 */
public class Server {
    public static void main(String[] arg) throws Exception{
        
        //SOAP:
        System.out.println("Publicerer Server");
        GalgelogikI gl = new GalgelogikImpl();
        Endpoint.publish("http://[::]:9901/galgeleg?wsdl", gl);
        System.out.println("Server publiceret");
        
        //RMI:
        // Enten: Kør programmet 'rmiregistry' fra mappen med .class-filerne, eller:
//		java.rmi.registry.LocateRegistry.createRegistry(1099); // start i server-JVM
//
//		GalgelogikI gl = new GalgelogikImpl();
//		Naming.rebind("rmi://localhost/galgeleg", gl);
//		System.out.println("Galgeleg registreret.");
        
    }
}
