import model.AutoTipus;
import model.EmbernevTipus;
import model.EtteremTipus;
import model.FutarTipus;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class AddAuto {

    private static String XML_PATH="src/xml/Feladat.xml";

    private static void addAuto() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(EtteremTipus.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        EtteremTipus etts = (EtteremTipus) jaxbUnmarshaller.unmarshal(new File(XML_PATH));
        AutoTipus auto = new AutoTipus();

        auto.setAutoID(3);
        auto.setTipus("Mercedes");
        auto.setRendszam("EEE-222");
        auto.setEvjarat(1990);
        auto.setSzin("Fekete");

        etts.getAuto().add(auto);

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
            addAuto();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

