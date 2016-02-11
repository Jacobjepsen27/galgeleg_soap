/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galgeleg;

import java.io.IOException;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService

/**
 *
 * @author JacobWorckJepsen
 */
//RMI interface extender java.rmi.Remote
//RMI metoder i interface skal throw java.rmi.RemoteException
public interface GalgelogikI{
    
    @WebMethod public ArrayList<String> getBrugteBogstaver(); //throws java.rmi.RemoteException;
    @WebMethod public String getSynligtOrd();//throws java.rmi.RemoteException;
    @WebMethod public String getOrdet();//throws java.rmi.RemoteException;
    @WebMethod public int getAntalForkerteBogstaver();//throws java.rmi.RemoteException;
    @WebMethod public boolean erSidsteBogstavKorrekt();//throws java.rmi.RemoteException;
    @WebMethod public boolean erSpilletVundet();//throws java.rmi.RemoteException;
    @WebMethod public boolean erSpilletTabt();//throws java.rmi.RemoteException;
    @WebMethod public boolean erSpilletSlut();//throws java.rmi.RemoteException;
    @WebMethod public void nulstil();//throws java.rmi.RemoteException;
    @WebMethod public void opdaterSynligtOrd();//throws java.rmi.RemoteException;
    @WebMethod public void gætBogstav(String bogstav);//throws java.rmi.RemoteException;
    @WebMethod public void logStatus();//throws java.rmi.RemoteException;
    //public static String hentUrl(String url) throws IOException, java.rmi.RemoteException;
//    public void hentOrdFraDr() throws Exception
    
    
}
