package partie1.metier;

public class IMetierImpl implements IMetier {
    private IDao iDao;

    public IMetierImpl(IDao iDao) {
        this.iDao = iDao;
    }

    @Override
    public double calcul() {
        System.out.println("current date: "+iDao.getDate());
        return 7*5;
    }
}
