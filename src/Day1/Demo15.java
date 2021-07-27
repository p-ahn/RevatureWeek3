package Day1;

class Book {
    public String title;
    public String author;
    public String date;
    public int price;

    public void printInfo(){
        System.out.println("Book: Title =" + title +" , Author=" + author + ", Price=" + price + ", Date=" + date);
    }
}

public class Demo15 {

    public static void main (String[]args){
        Book book1 = new Book();
        book1.title = "Java";
        book1.author = "Author 1";
        book1.price = 100;
        book1.date = "1997";

        Book book2 = new Book();
        book2.title = "Python";
        book2.author = "Philip";
        book2.price = 50;
        book2.date = "1998";

        book1.printInfo();
        book2.printInfo();


    }

}
