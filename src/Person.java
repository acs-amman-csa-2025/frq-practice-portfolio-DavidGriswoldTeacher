public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String career;

    public Person() {
        firstName = "first";
        lastName = "last";
        age = 0;
        career = "unemployed";
    }

    public Person(String first, String last, int myAge, String myCareer) {
        firstName = first;
        lastName = last;
        age = myAge;
        career = myCareer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

}
