import model.AutoTipus;
import model.EtteremTipus;

import javax.xml.bind.JAXBException;

public class SearchAuto {

    private static void searchAuto() throws JAXBException {
        EtteremTipus etts = ContentUnmarshall.Load();

        int ID = 1;

        for(AutoTipus auto : etts.getAuto()){
            if(auto.getAutoID() == ID){
                System.out.println("Auto ID: " + auto.getAutoID());
                System.out.println("Auto tipus: " + auto.getTipus());
                System.out.println("Auto Rendzsam: " + auto.getRendszam());
                System.out.println("Auto evjarat: " + auto.getEvjarat());
                System.out.println("Auto szin: " + auto.getSzin());
            }
        }


    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            searchAuto();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
