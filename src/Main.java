public class Main {
    public static void main(String[] args) {

        Family family = new Family("Meerim ele");
        Family family2 = new Family("Jiyde eje");
        Family family3 = new Family("Nuriza");
        Family family4 = new Family("Aynazik");
        Family family5 = new Family("Eliza");
        Family[] people = {family, family2, family3, family4, family5};
        Appartment appartment = new Appartment(people);
        System.out.println(appartment);

        System.out.print(appartment.payForservise());
        System.out.println();


        Family family6 = new Family("Samira");
        Family family7 = new Family("Jenish bayke");
        Family family8 = new Family("Ilim");
        Family family9 = new Family("Keldibek");

        Family[] people1 = {family6, family7, family8, family9};
        Hostel hostel = new Hostel(people1);
        System.out.println(hostel);

        System.out.println(hostel.payRent());

        Family family10 = new Family("Alibek");
        Family family11 = new Family("Aygerim");
        Family family12 = new Family("Altynbek");
        Family family13 = new Family("Davran");

        Family [] people2 = {family11,family10,family12, family13};

        Hotel hotel = new Hotel(people2);
        System.out.println(hotel);
        System.out.println(hotel.payRent());

    }
}

