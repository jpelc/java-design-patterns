package jpelc.learning.designpatterns.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrcKing implements King {

    private static final Logger logger = LoggerFactory.getLogger(OrcKing.class);

    public OrcKing() {
        logger.info("invoked");
    }
}
