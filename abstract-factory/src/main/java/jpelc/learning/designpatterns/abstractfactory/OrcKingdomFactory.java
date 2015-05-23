package jpelc.learning.designpatterns.abstractfactory;

public class OrcKingdomFactory implements KingdomFactory {

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Castle createCastle() {
        return new OrcCaste();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }

}
