/**
* Enum representation supported cooking measures for console output.
*
* @version  0.1.0
* @since    1.12.2025
* @author   AlexandrAnatoliev
*/
public enum Measures {
    ML(1),
    CUP(250),
    TBSP(15),
    TSP(5),
    ERROR(-1);

    public final int inMl;

    Measures(int inMl) {
        this.inMl = inMl;
    }
 }
