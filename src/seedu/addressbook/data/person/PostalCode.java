package seedu.addressbook.data.person;


// Creates a PostalCode class to take in PostalCode variable
public class PostalCode {

    private static String post;

    public PostalCode(String pst){

        this.post = pst;
    }

    public String getPost() {
        return post;
    }

    public static void setPost(String post) {
        PostalCode.post = post;
    }
}
