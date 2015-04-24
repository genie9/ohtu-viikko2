package ohtu;

import java.util.ArrayList;
import java.util.List;

public interface Komento {
    
    public List<Integer> tulokset = new ArrayList();
    
    boolean isNotEmpty();
    
    void suorita();

    void peru();

}
