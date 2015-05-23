package jpelc.learning.designpatterns.abstractfactory;

public interface KingdomFactory {

    King createKing();
    Castle createCastle();
    Army createArmy();

}
