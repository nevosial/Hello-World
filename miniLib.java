class Library{
    static String city_name = "San Jose";
    String libname;
    String foundingyear;
    String libloc;
    String street;
    String book_name;
    String author;
    String genre;
    long uid;
    
    public void libdetails()
    {
        System.out.println();
        System.out.println("----Library Details----");
        System.out.println("Library Name: "+libname);
        System.out.println("Founding Year: "+foundingyear);
        System.out.println("Location: "+libloc);
        System.out.println("------------------------");
    
    
    }
    
    public void bookdetails()
    {
        System.out.println();
        System.out.println("=========================");
        System.out.println("Book Name: "+book_name);
        System.out.println("Author: "+author);
        System.out.println("Genre: "+genre);
        System.out.println("Uid: "+uid);
        System.out.println("=========================");
    }
}

class miniLib{
    public static void main(String args[])
    {
        Library walkerst = new Library();
        Library bushst = new Library();
        
        walkerst.libname = "JFK Library";
        walkerst.foundingyear = "5-Oct-1991";
        walkerst.street = "Walker Street";
        walkerst.libloc = "Martin Pier, San Jose";
        walkerst.book_name = "Mein Kampf";
        walkerst.author = "Adolf Hitler";
        walkerst.genre = "Biography";
        walkerst.uid = 19570101;
        
        bushst.libname = "MLK Library";
        bushst.foundingyear = "2-May-1982";
        bushst.street = "Bush Square";
        bushst.libloc = "Downtown, San Jose";
        bushst.book_name = "Life of Pi";
        bushst.author = "Yann Martel";
        bushst.genre = "Fiction";
        bushst.uid = 20080808;
        
        walkerst.libdetails();
        bushst.libdetails();
        
        walkerst.bookdetails();
        bushst.bookdetails();
    }
 }
