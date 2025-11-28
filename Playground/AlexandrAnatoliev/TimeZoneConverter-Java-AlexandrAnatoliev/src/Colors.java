/**
* Enum representation supported ANCI color codes for console output.
*
* @version  0.1.0
* @since    28.11.2025
* @author   AlexandrAnatoliev
*/
 public enum Colors {
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    /** Reset ANCI color code */
    NOCOLOR("\u001B[0m");

    private final String code;

    Colors(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
 }
