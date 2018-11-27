import model.EtteremTipus;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ContentUnmarshall {

    private static String XML_PATH="src/xml/Feladat.xml";

    public static EtteremTipus Load() throws JAXBException{
        JAXBContext jaxbContext = JAXBContext.newInstance(EtteremTipus.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        EtteremTipus etts = (EtteremTipus) jaxbUnmarshaller.unmarshal( new File(XML_PATH) );
        return etts;
    }

}
