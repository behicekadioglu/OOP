public interface IApp {

    Object clone() throws CloneNotSupportedException;

    @Override
    boolean equals(Object obj);

    @Override
    String toString();
    
}
