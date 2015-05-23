package jpelc.learning.designpatterns.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrcCaste implements Castle {

    private static final Logger logger = LoggerFactory.getLogger(OrcCaste.class);

    public OrcCaste() {
        logger.info("invoked");
    }
}
