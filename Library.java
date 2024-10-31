import java.util.Hashtable;

/* The Library class extends the Building class. It adds a collection of books that can be borrowed and returned. */
public class Library extends Building{

  private Hashtable<String, Boolean> collection;

  /**
   * Creates an instance of the class Library.
   * @param name The name of the Library.
 