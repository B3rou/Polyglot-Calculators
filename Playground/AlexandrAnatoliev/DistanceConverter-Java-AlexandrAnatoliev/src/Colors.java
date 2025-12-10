/**
* Enum representation supported ANSI color codes for console output.
*
* @version  0.1.0
* @since    2.12.2025
* @author   AlexandrAnatoliev
*/
 public enum Colors {
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    /** Reset ANSI color code */
    RESET("\u001B[0m");

    private final String code;

    Colors(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }

    /** 
    * Convenience method to colorize text
    * 
    * @param text The text to colorize
    * @return The colorized string 
    */
    public String apply(String text) {
        return this + text + RESET;
    }
 }
