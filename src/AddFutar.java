import model.EmbernevTipus;
import model.EtteremTipus;
import model.FutarTipus;
import javax.xml.bind.JAXBException;

public class AddFutar {


    private static void addFutar() throws JAXBException {
        EtteremTipus etts = ContentUnmarshall.Load();

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

