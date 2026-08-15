package house.domain;

public class House {
    private int age;
    private String name;
    private String phon;
    private String address;
    private int rent;
    private String state;

    public House(int age, String name, String phon, String address, int rent, String state) {
        this.age = age;
        this.name = name;
        this.phon = phon;
        this.address = address;
        this.rent = rent;
        this.state = state;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhon() {
        return phon;
    }

    public void setPhon(String phon) {
        this.phon = phon;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return age +
                "\t" + name +
                "\t" + phon  +
                "\t" + address  +
                "\t" + rent +
                "\t" + state ;
    }
}
