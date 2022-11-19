import java.util.Arrays;

public class Hotel implements Rent{

 private Family [] people;

    public Hotel(Family[] people) {
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
        return "They are pay 25 000 for rent";
    }

    @Override
    public String toString() {
        return "Hotel " +
                "people=" + Arrays.toString(people) +
                '.';
    }
}
