// Author: Vishwas Karode (GitHub: vishwasio)

package input

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

// Reads non-empty input from user with validation and example
func Prompt(message string, example string) string {
    reader := bufio.NewReader(os.Stdin)

    for {
        fmt.Println(message)
        fmt.Printf("Example: %s\n", example)

        text, _ := reader.ReadString('\n')
        text = strings.TrimSpace(text)

        if text != "" {
            return text
        }

        fmt.Println("Invalid input. Please try again.\n")
    }
}
