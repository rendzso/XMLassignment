import model.*;
import javax.xml.bind.JAXBException;


public class Marshalling {

    private static String XML_PATH="src/xml/Feladat.xml";

    private static void marshalingExample() throws JAXBException
    {
        EtteremTipus etterem = new EtteremTipus();
        HelyTipus hely = new HelyTipus();
        EmbernevTipus nev1 = new EmbernevTipus();
        FutarTipus futar1 = new FutarTipus();
        EmbernevTipus nev2 = new EmbernevTipus();
        FutarTipus futar2 = new FutarTipus();
        AutoTipus auto1 = new AutoTipus();
        AutoTipus auto2 = new AutoTipus();


        etterem.setNev("Kifozde");

        hely.setIranyitoszam(3908);
        hely.setVaros("Ratka");
        hely.setUtca("Petofi Sandor utca");
        hely.setHazszam(6);
        etterem.setHely(hely);

        futar1.setFutarID(1);
        futar1.setMunkaAutoID(1);
        nev1.setVezeteknev("Bodnar");
        nev1.setKeresztnev("Renato");
        futar1.setNev(nev1);
        futar1.setKor(23);

        etterem.getFutar().add(futar1);

        futar2.setFutarID(2);
        futar2.setMunkaAutoID(2);
        nev2.setVezeteknev("Toth");
        nev2.setKeresztnev("Bela");
        futar2.setNev(nev2);
        futar2.setKor(30);

        etterem.getFutar().add(futar2);

        auto1.setAutoID(1);
        auto1.setTipus("Honda");
        auto1.setRendszam("ABC-123");
        auto1.setEvjarat(1996);
        auto1.setSzin("Zold");

        etterem.getAuto().add(auto1);

        auto2.setAutoID(2);
        auto2.setTipus("Suzuki");
        auto2.setRendszam("BCD-321");
        auto2.setEvjarat(2000);
        auto2.setSzin("Kek");

        etterem.getAuto().add(auto2);

        ContentChangeMarshall.Save(etterem);

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            marshalingExample();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
