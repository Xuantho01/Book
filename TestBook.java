import java.util.Arrays;

public class TestBook {
    public static void main(String[] args) {

        BookProgaming bookProgaming1 = new BookProgaming(123,"java Programming",100,"Mr.Doan","Java","anfjkh");
        BookProgaming bookProgaming2 = new BookProgaming(456,"java Programming",100,"Mr.Doan","Java","anfjkh");
        BookProgaming bookProgaming3 = new BookProgaming(789,"java Programming",100,"Mr.Doan","Java","anfjkh");

        FictionBook fictionBook1 = new FictionBook(111,"JavaScript Programming",150,"Mr.Tho","asdadasd");
        FictionBook fictionBook2 = new FictionBook(222,"JavaScript Programming",150,"Mr.Tho","asdadasd");
        FictionBook fictionBook3 = new FictionBook(333,"JavaScript Programming",150,"Mr.Tho","asdadasd");

        Book.setAddbook(bookProgaming1);
        Book.setAddbook(bookProgaming2);
        Book.setAddbook(bookProgaming3);
        Book.setAddbook(fictionBook1);
        Book.setAddbook(fictionBook2);
        Book.setAddbook(fictionBook3);
        double priceTotal = 0;
        int totaljavaBook = 0;

        for(Book arrayList: Book.booklists){
            if(arrayList==null){
                break;
            }
            priceTotal += arrayList.getPrice();
        }
        System.out.println(priceTotal);
        for (int i = 0; i < Book.booklists.length; i++){
            boolean isBookProgramming = Book.booklists[i] instanceof BookProgaming;
                if(isBookProgramming){
                    boolean isJavaBook = ((BookProgaming)Book.booklists[i]).getLanguage().equals("Java");
                    if(isJavaBook){
                        totaljavaBook++;
                    }
                }
        }
        System.out.println(totaljavaBook);
    }

}
