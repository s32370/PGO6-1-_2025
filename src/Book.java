public class Book {
}

//Add two private fields specific to books:
//String author – stores the authorʼs full name
//int numberOfPages – stores the number of pages in the book


//The constructor should accept four parameters: title , publicationYear , author ,
//numberOfPages
//Call the superclass constructor using super(title, publicationYear)
//Initialize the book-specific fields: this.author = author and this.numberOfPages =
//numberOfPages

//Override the displayInformation() method using the @Override annotation
//First, call the superclass version of this method using super.displayInformation()
//Then, add the display of information specific to books: author and number of pages

//Create a method checkNumberOfPages() that evaluates whether the book is long
//Inside the method, check whether numberOfPages > 500 . If so, display a message that
//it's a long book. Otherwise, say itʼs a standard book. In both cases, include the number of
//pages.