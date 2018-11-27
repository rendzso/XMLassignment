import model.AutoTipus;
import model.EmbernevTipus;
import model.EtteremTipus;
import model.FutarTipus;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class UpdateAuto {

    private static String XML_PATH="src/xml/Feladat.xml";

    private static void updateAuto() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(EtteremTipus.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        EtteremTipus etts = (EtteremTipus) jaxbUnmarshaller.unmarshal(new File(XML_PATH));

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



        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //Marshal the employees list in console
        jaxbMarshaller.marshal(etts, System.out);

        //Marshal the employees list in file
        jaxbMarshaller.marshal(etts, new File(XML_PATH));

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
