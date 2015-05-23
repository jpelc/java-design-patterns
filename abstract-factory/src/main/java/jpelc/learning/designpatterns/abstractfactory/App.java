package jpelc.learning.designpatterns.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("invoked");

        createKingdom(new OrcKingdomFactory());
        createKingdom(new ElfKingdomFactory());
    }

    public static void createKingdom(KingdomFactory kingdomFactory) {
        logger.info("invoked");
        kingdomFactory.createKing();
        kingdomFactory.createCastle();
        kingdomFactory.createArmy();
        logger.info("finished");
    }

}
