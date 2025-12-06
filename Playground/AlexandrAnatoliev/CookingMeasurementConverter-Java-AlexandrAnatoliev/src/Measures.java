/**
* Enum representation of common cooking measures with conversation to milliliters.
*
* @version  0.1.0
* @since    2.12.2025
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
