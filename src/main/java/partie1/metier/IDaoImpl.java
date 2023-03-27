package partie1.metier;

import java.time.LocalDate;

public class IDaoImpl implements IDao {
    @Override
    public LocalDate getDate() {
        return LocalDate.now();
    }
}
