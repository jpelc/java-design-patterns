package jpelc.learning.designpatterns.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElfArmy implements Army {

    private static final Logger logger = LoggerFactory.getLogger(ElfArmy.class);

    public ElfArmy() {
        logger.info("invoked");
    }
}
