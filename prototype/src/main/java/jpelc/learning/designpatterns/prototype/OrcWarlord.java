package jpelc.learning.designpatterns.prototype;

public class OrcWarlord extends Warlord {

    public OrcWarlord() {
    }

    public OrcWarlord(Warlord warlord) {
    }

    @Override
    public Warlord clone() throws CloneNotSupportedException {
        return new OrcWarlord(this);
    }

    @Override
    public String toString() {
        return "Orcish warlord";
    }
}
