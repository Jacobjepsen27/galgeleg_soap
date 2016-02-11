package galgeleg;

import java.net.URL;
import java.rmi.Naming;
import java.util.Scanner;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {
    
    public boolean spillet = true;

  public static void main(String[] args) throws Exception{
      
    //RMI forbindelses kald:
    //GalgelogikI spil = (GalgelogikI) Naming.lookup("rmi://localhost/galgeleg");
    //spil.nulstil();
/*
    try {
      spil.hentOrdFraDr();
    } catch (Exception e) {
      e.printStackTrace();
    }
*/

//SOAP:

    URL url = new URL("http://localhost:9901/galgeleg?wsdl");
    QName qname = new QName("http://galgeleg/", "GalgelogikImplService");
    Service service = Service.create(url, qname);
    GalgelogikI spil = service.getPort(GalgelogikI.class);
    
    while(true){
        System.out.println(spil.getSynligtOrd());
        System.out.print("Gæt et bogstav: ");
        Scanner scan = new Scanner(System.in);
        spil.gætBogstav(scan.nextLine());
        if(spil.erSpilletSlut()){
            System.out.println("Spillet er slut");
            if(spil.erSpilletTabt()){
                System.out.println("Du har desværre tabt");
            }
            if(spil.erSpilletVundet()){
                System.out.println("Hurra du har vundet");
            }
            break;
        }
    }
//    spil.gætBogstav("e");
//    spil.logStatus();
//
//    spil.gætBogstav("a");
//    spil.logStatus();
//    System.out.println("" + spil.getAntalForkerteBogstaver());
//    System.out.println("" + spil.getSynligtOrd());
//    if (spil.erSpilletSlut()) return;
//
//    spil.gætBogstav("i");
//    spil.logStatus();
//    if (spil.erSpilletSlut()) return;
//
//    spil.gætBogstav("s");
//    spil.logStatus();
//    if (spil.erSpilletSlut()) return;
//
//    spil.gætBogstav("r");
//    spil.logStatus();
//    if (spil.erSpilletSlut()) return;
//
//    spil.gætBogstav("l");
//    spil.logStatus();
//    if (spil.erSpilletSlut()) return;
//
//    spil.gætBogstav("b");
//    spil.logStatus();
//    if (spil.erSpilletSlut()) return;
//
//    spil.gætBogstav("o");
//    spil.logStatus();
//    if (spil.erSpilletSlut()) return;
//
//    spil.gætBogstav("t");
//    spil.logStatus();
//    if (spil.erSpilletSlut()) return;
//
//    spil.gætBogstav("n");
//    spil.logStatus();
//    if (spil.erSpilletSlut()) return;
//
//    spil.gætBogstav("m");
//    spil.logStatus();
//    if (spil.erSpilletSlut()) return;
//
//    spil.gætBogstav("y");
//    spil.logStatus();
//    if (spil.erSpilletSlut()) return;
//
//    spil.gætBogstav("p");
//    spil.logStatus();
//    if (spil.erSpilletSlut()) return;
//
//    spil.gætBogstav("g");
//    spil.logStatus();
//    if (spil.erSpilletSlut()) return;
  }
}
