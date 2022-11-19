import java.util.Arrays;

public class Appartment implements ComServise{

    private Family [] poeple;

    public Appartment(Family[] poeple) {
        this.poeple = poeple;
    }

    public Family[] getPoeple() {
        return poeple;
    }

    public void setPoeple(Family[] poeple) {
        this.poeple = poeple;
    }

    @Override
    public String payForservise() {
        return  "They are  pay 50 000 for month";
    }

    @Override
    public String toString() {
        return " At the Appartment live   " +
                "families: =" + Arrays.toString(poeple) +
                '.';
    }
}
