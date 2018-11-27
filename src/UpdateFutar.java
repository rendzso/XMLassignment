import model.EmbernevTipus;
import model.EtteremTipus;
import model.FutarTipus;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class UpdateFutar {

    private static String XML_PATH="src/xml/Feladat.xml";

    private static void updateFutar() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(EtteremTipus.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        EtteremTipus etts = (EtteremTipus) jaxbUnmarshaller.unmarshal(new File(XML_PATH));

        int ID = 1;

        for(FutarTipus futar : etts.getFutar()){
            if(futar.getFutarID() == ID){
                EmbernevTipus nev = new EmbernevTipus();
                nev.setVezeteknev("Elso");
                nev.setKeresztnev("Masodik");
                futar.setFutarID(5);
                futar.setMunkaAutoID(5);
                futar.setNev(nev);
                futar.setKor(50);
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
            updateFutar();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
