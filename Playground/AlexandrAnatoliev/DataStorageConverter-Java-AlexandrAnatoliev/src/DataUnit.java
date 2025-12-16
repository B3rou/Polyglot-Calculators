/**
 * Enum representating of different units of digital data storage 
 * with conversion to Bits.
 *
 * @version  0.1.1
 * @since    14.12.2025
 * @author   AlexandrAnatoliev
 */
public enum DataUnit {
    b(1),                   // Bits
    B(b.inBit * 8),         // Bytes
    KB(B.inBit * 1024),     // Kilobytes
    MB(KB.inBit * 1024),    // Megabytes
    GB(MB.inBit * 1024),    // Gigabytes
    TB(GB.inBit * 1024),    // Terabytes
    PB(TB.inBit * 1024),    // Petabytes
    ERROR(-1);

    public final long inBit;

    DataUnit(long inBit) {
        this.inBit = inBit;
    }
}
