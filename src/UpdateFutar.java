import model.EmbernevTipus;
import model.EtteremTipus;
import model.FutarTipus;
import javax.xml.bind.JAXBException;

public class UpdateFutar {

    private static String XML_PATH="src/xml/Feladat.xml";

    private static void updateFutar() throws JAXBException {
        EtteremTipus etts = ContentUnmarshall.Load();

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


        ContentChangeMarshall.Save(etts);
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
