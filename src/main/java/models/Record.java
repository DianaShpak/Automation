package additional;

import additional.Printer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Record implements Printer {

    private final static Logger LOG = LogManager.getLogger("Запись");
    private int id;

    public Record(int id) {
        this.id = id;
        LOG.info("Record " + id);
    }

    public int getId() {
        return id;
    }
}
