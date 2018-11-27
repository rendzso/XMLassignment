import model.AutoTipus;
import model.EtteremTipus;
import model.HelyTipus;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class UpdateEtterem {

    private static String XML_PATH="src/xml/Feladat.xml";

    private static void updateEtterem() throws JAXBException {
        EtteremTipus etts = ContentUnmarshall.Load();

        etts.setNev("Valtottam nevet");
        etts.getHely().setIranyitoszam(1234);
        etts.getHely().setVaros("Valami");
        etts.getHely().setUtca("Nincs ilyen utca");
        etts.getHely().setHazszam(10);



        ContentChangeMarshall.Save(etts);

    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            updateEtterem();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
