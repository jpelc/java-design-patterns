package jpelc.learning.designpatterns.prototype;

public abstract class Prototype implements Cloneable {

    @Override
    public abstract Object clone() throws CloneNotSupportedException;
}
