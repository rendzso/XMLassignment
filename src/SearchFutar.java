import model.EtteremTipus;
import model.FutarTipus;

import javax.xml.bind.JAXBException;

public class SearchFutar {

    private static void searchFutar() throws JAXBException {
        EtteremTipus etts = ContentUnmarshall.Load();

        int ID = 1;

        for(FutarTipus futar : etts.getFutar()){
            if(futar.getFutarID() == ID){
                System.out.println("Futar ID: " + futar.getFutarID());
                System.out.println("Munkaauto ID: " + futar.getMunkaAutoID());
                System.out.println("Futar Vez.nev: " + futar.getNev().getVezeteknev());
                System.out.println("Futar Ker.nev: " + futar.getNev().getKeresztnev());
                System.out.println("Futar Kor: " + futar.getKor());
            }
        }


    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            searchFutar();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
