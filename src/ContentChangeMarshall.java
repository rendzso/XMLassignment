import model.EtteremTipus;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class ContentChangeMarshall {

    private static String XML_PATH="src/xml/Feladat.xml";

    public static void Save(EtteremTipus etts) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(EtteremTipus.class);

        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //Marshal the employees list in console
        jaxbMarshaller.marshal(etts, System.out);

        //Marshal the employees list in file
        jaxbMarshaller.marshal(etts, new File(XML_PATH));

    }



}
