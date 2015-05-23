package jpelc.learning.designpatterns.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElfKing implements King {

    private static final Logger logger = LoggerFactory.getLogger(ElfKing.class);

    public ElfKing() {
        logger.info("invoked");
    }
}
