package partie1.istatic;

import partie1.metier.IDao;
import partie1.metier.IDaoImpl;
import partie1.metier.IMetier;
import partie1.metier.IMetierImpl;

public class StaticInstantiation {
    public static void main(String[] args) {
        IDao iDao = new IDaoImpl();
        IMetier iMetier = new IMetierImpl(iDao);
        double result = iMetier.calcul();
        System.out.println("iMetier.calcul(): "+result);
    }
}
