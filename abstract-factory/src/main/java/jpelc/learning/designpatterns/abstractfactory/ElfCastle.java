package jpelc.learning.designpatterns.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElfCastle implements Castle {

    private static final Logger logger = LoggerFactory.getLogger(ElfCastle.class);

    public ElfCastle() {
        logger.info("invoked");
    }
}
