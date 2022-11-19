import java.util.Arrays;

public class Hostel implements Rent{

    private Family [] people;

    public Hostel(Family[] people) {
        this.people = people;
    }

    public Family[] getPeople() {
        return people;
    }

    public void setPeople(Family[] people) {
        this.people = people;
    }

    @Override
    public String payRent() {
        return " They  are pay 25 000 for rent";
    }

    @Override
    public String toString() {
        return " In the Hostel live " +
                "families =" + Arrays.toString(people) +
                '.';
    }
}
