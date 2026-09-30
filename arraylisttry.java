    
import java.util.ArrayList;
class chocolate{
    private int id;
    private String tagline;
    private int rating;
    //getters & setters
    public chocolate(int id, String tagline, int rating) {
        this.id = id;
        this.tagline = tagline;
        this.rating = rating;
    }

    // public int getId() {
    //     return id;
    // }

    // public void setId(int id) {
    //     this.id = id;
    // }

    // public String getTagline() {
    //     return tagline;
    // }

    // public void setTagline(String tagline) {
    //     this.tagline = tagline;
    // }

    // public int getRating() {
    //     return rating;
    // }

    // public void setRating(int rating) {
    //     this.rating = rating;
    // }

    @Override
    public String toString() {
        return "chocolate{id=" + id + ", tagline='" + tagline + "', rating=" + rating + "}";
    }

}
public class arraylisttry{

    public static void main(String args[]){

        ArrayList<chocolate> chocolates = new ArrayList<>();

        chocolates.add(new chocolate(1,"Delicious and creamy", 5));


        chocolates.add(new chocolate(2,"Rich and smooth", 4));
        chocolates.add(new chocolate(3,"Sweet and indulgent", 3));


        for (chocolates chocolate : itm){
            System.out.println(itm);
        }


        



    }
}