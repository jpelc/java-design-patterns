package jpelc.learning.designpatterns.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrcArmy implements Army {

    private static final Logger logger = LoggerFactory.getLogger(OrcArmy.class);

    public OrcArmy() {
        logger.info("invoked");
    }
}
