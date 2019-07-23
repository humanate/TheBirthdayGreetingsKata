package Bean;

public class Email {
    private String subject;
    private String content;
    private String firstName;

    public Email(String first_name) {
        this.subject = "Happy birthday!";
        this.content = "Happy\nbirthday,\ndear";
        this.firstName = first_name;
    }

    @Override
    public String toString() {
        return "Subject:" + subject + "\n" + content + "\n" + firstName + "!\n";
    }
}
