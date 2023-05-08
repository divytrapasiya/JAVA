class CLassBook 
{
    int book_id;
    String title, author;

    Book()
    {
        System.out.println("default constructor >>");
    }

    Book(int s1,String d1,String a1)
    {
        System.out.println("constructor >>");
        book_id=s1;
        title=d1;
        author=a1;
    }

    void disPlay()
    {
        System.out.println("book_id=" +s1+ "title=" +d1+ "author=" +a1);
    }


    public static void main(String[] args)
    {
        book_id b=new book_id();
        book_id book=new book_id(s1=111,d1="java programming",a1="jemas goslin");
        book.disPlay();
    }
}