public class LibrarySystem {
    public static void main(String[] args) {
        Library lib = new Library();
        Member mbr = new Member(1, "Khushi Chaudhary");
        lib.addBook(new BookCollection(101, "Java basics", "James Ghosling"));
        lib.addBook(new BookCollection(102, "Data Structures", "Robert Lafore"));

        lib.showBooks();

        lib.issueBooks(101, mbr);
        lib.showBooks();

        lib.returnBook(101);
        lib.showBooks();
    }
}
