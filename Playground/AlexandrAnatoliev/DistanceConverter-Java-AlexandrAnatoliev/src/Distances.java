/**
* Enum representation of common distances with conversion to meters.
*
* @version  0.1.0
* @since    6.12.2025
* @author   AlexandrAnatoliev
*/
public enum Distances {
    MM(0.001),      // millimeter
    CM(0.01),       // centimeter
    DM(0.1),        // decimeter
    M(1),           // meter
    KM(1000),       // kilometer
    IN(0.0254),     // inch
    FT(0.3048),     // foot 
    YD(0.9144),     // yard
    MI(1609.344),   // mile
    NMI(1852),      // nautical mile
    VRSH(0.04445),  // vershok
    PYA(0.1778),    // pyad
    LOK(0.45),      // lokot
    ARS(0.7112),    // arshin
    SAZ(2.1336),    // sazhen
    VRST(1.0668),   // versta
    ERROR(-1);      // incorrect input

    public final double inM;

    Distances(double inM) {
        this.inM = inM;
    }
 }
