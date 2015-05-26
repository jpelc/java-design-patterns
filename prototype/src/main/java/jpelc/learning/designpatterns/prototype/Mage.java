package jpelc.learning.designpatterns.prototype;

public abstract class Mage extends Prototype {

    @Override
    public abstract Mage clone() throws CloneNotSupportedException;
}
