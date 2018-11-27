import model.AutoTipus;
import model.EtteremTipus;
import javax.xml.bind.JAXBException;

public class AddAuto {

    private static String XML_PATH="src/xml/Feladat.xml";

    private static void addAuto() throws JAXBException {
        EtteremTipus etts = ContentUnmarshall.Load();

        AutoTipus auto = new AutoTipus();

        auto.setAutoID(3);
        auto.setTipus("Mercedes");
        auto.setRendszam("EEE-222");
        auto.setEvjarat(1990);
        auto.setSzin("Fekete");

        etts.getAuto().add(auto);

        ContentChangeMarshall.Save(etts);

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

