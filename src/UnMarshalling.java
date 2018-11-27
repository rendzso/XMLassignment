import model.AutoTipus;
import model.EtteremTipus;
import model.FutarTipus;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class UnMarshalling{

    private static String XML_PATH="src/xml/Feladat.xml";

    public static void main(String[] args) throws JAXBException{
    JAXBContext jaxbContext = JAXBContext.newInstance(EtteremTipus.class);
    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

    EtteremTipus etts = (EtteremTipus) jaxbUnmarshaller.unmarshal( new File(XML_PATH) );


        System.out.println("Etterem neve: " + etts.getNev());
        System.out.println("Iranyitoszam: " + etts.getHely().getIranyitoszam());
        System.out.println("Varos: " + etts.getHely().getVaros());
        System.out.println("Utca: " + etts.getHely().getUtca());
        System.out.println("Hazszam: " + etts.getHely().getHazszam());
        System.out.println("---------------------");
        for(FutarTipus futarTipus : etts.getFutar()){
            System.out.println("Futar ID: " + futarTipus.getFutarID());
            System.out.println("Munkaauto ID: " + futarTipus.getMunkaAutoID());
            System.out.println("Futar Vez.nev: " + futarTipus.getNev().getVezeteknev());
            System.out.println("Futar Ker.nev: " + futarTipus.getNev().getKeresztnev());
            System.out.println("Futar Kor: " + futarTipus.getKor());
            System.out.println("---------------------");
    }
        for (AutoTipus autoTipus : etts.getAuto()){
            System.out.println("Auto ID: " + autoTipus.getAutoID());
            System.out.println("Auto tipus: " + autoTipus.getTipus());
            System.out.println("Auto Rendzsam: " + autoTipus.getRendszam());
            System.out.println("Auto evjarat: " + autoTipus.getEvjarat());
            System.out.println("Auto szin: " + autoTipus.getSzin());
            System.out.println("---------------------");
        }
    }

}
