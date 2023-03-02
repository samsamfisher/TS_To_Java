import java.util.*;

public class User {

    private Date birthdate;
    private int size;

    public User(Date birthdate, int size) {
        this.birthdate = birthdate;
        this.size = size;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {

        User user = new User(new Date(), 10);
        user.getBirthdate();

        Photo photo = new Photo("https://www.google.com/images/branding/googlelogo/1x/", "Google", 45, 45);
        photo.getFilename();

        Address adress = new Address("45", "prout", "Paris", "France");
        adress.getStreet();
    }
}