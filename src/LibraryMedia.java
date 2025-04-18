public class LibraryMedia {

    protected String title;
    protected int publication_year;
    protected boolean available;
//The constructor should accept two parameters: title and publicationYear
    public LibraryMedia(String title, int publication_year) {
        this.title = title;
        this.publication_year = publication_year;
        available = true;

    }
//Inside the constructor, assign the values of the parameters to the class fields using the
//this keyword
//Additionally, set the available field to true (we assume that a newly added medium is
//available)


//Method implementation

    public void borrow(){
        if (available){
            available = false;
            System.out.println(title + "   //display a message that the media is already borrowed.");
        }else {
            System.out.println(title + "   //display a message that the media is not borrowed.");
        }
    }
    //borrow() : This method should check whether the media is available. If it is, change the
    //available status to false and display a message indicating it has been borrowed. If not,

    //returnMedia() : This method checks whether the media is borrowed (i.e., available ==
    //false ). If it is, change the status to available = true and display a return confirmation
    public void returnMedia(){
        if (!available){
            available = true;
            System.out.println(title + " has been returned ");
        } else{
            System.out.println(title + " is sitill availabel");
        }
    }

    //message. If not, inform the user that the media wasnʼt borrowed.
    //displayInformation() : This method displays basic information about the media: title,
    //publication year, and availability. Use the ternary operator ( available ? "Available" :
    //"Borrowed" ) to display the availability status.

    public void displayInformation(){
        System.out.println(title);
        System.out.println(publication_year);
        System.out.println(available);
    }




}

//Create three fields with the protected modifier so they are accessible in subclasses:
//String title – stores the title of the library media
//int publicationYear – stores the year of publication
//boolean available – flag indicating whether the media is available for borrowing
