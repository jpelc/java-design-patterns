package jpelc.learning.designpatterns.prototype;

public abstract class Beast extends Prototype {

    @Override
    public abstract Beast clone() throws CloneNotSupportedException;
}
