package jpelc.learning.designpatterns.prototype;

public class OrcBeast extends Beast {

    public OrcBeast() {
    }

    public OrcBeast(OrcBeast orcBeast) {
    }

    @Override
    public Beast clone() throws CloneNotSupportedException {
        return new OrcBeast(this);
    }

    @Override
    public String toString() {
        return "Orcish beast";
    }

}
