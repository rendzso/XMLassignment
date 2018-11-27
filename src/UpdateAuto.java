import model.AutoTipus;
import model.EtteremTipus;
import javax.xml.bind.JAXBException;


public class UpdateAuto {

    private static String XML_PATH="src/xml/Feladat.xml";

    private static void updateAuto() throws JAXBException {
        EtteremTipus etts = ContentUnmarshall.Load();

        int ID = 1;

        for(AutoTipus auto : etts.getAuto()){
             if(auto.getAutoID() == ID){
                 auto.setAutoID(5);
                 auto.setTipus("Uj tipus");
                 auto.setRendszam("RRR-111");
                 auto.setEvjarat(2010);
                 auto.setSzin("Uj szin");
             }
        }



        ContentChangeMarshall.Save(etts);

    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            updateAuto();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
