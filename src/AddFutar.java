import model.EmbernevTipus;
import model.EtteremTipus;
import model.FutarTipus;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class AddFutar {

    private static String XML_PATH="src/xml/Feladat.xml";

    private static void addFutar() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(EtteremTipus.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        EtteremTipus etts = (EtteremTipus) jaxbUnmarshaller.unmarshal(new File(XML_PATH));
        FutarTipus futar = new FutarTipus();
        EmbernevTipus nev = new EmbernevTipus();

        futar.setFutarID(3);
        futar.setMunkaAutoID(3);
        nev.setVezeteknev("Humbak");
        nev.setKeresztnev("Ferenc");
        futar.setNev(nev);
        futar.setKor(45);

        etts.getFutar().add(futar);

        ContentChangeMarshall.Save(etts);

    }


        public static void main(String[] args) {
            // TODO Auto-generated method stub
            try {
                addFutar();
            } catch (JAXBException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

