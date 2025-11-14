// Author: Vishwas Karode (GitHub: vishwasio)

package menu

import (
	"bufio"
	"fmt"
	"os"
	"strings"

	"CryptoCalculator-Go-vishwasio/internal/aescalc"
	"CryptoCalculator-Go-vishwasio/internal/basecalc"
	"CryptoCalculator-Go-vishwasio/internal/filehash"
	"CryptoCalculator-Go-vishwasio/internal/hashcalc"
	"CryptoCalculator-Go-vishwasio/internal/hmaccalc"
	"CryptoCalculator-Go-vishwasio/internal/rsacalc"
	"CryptoCalculator-Go-vishwasio/internal/utils"
)

func Start() {
    reader := bufio.NewReader(os.Stdin)

    for {
        utils.Separator()
        fmt.Println("                  CRYPTO CALCULATOR (v1)")
        utils.Separator()

        fmt.Println(`
Choose what you want to calculate:

1) Hash Calculator
2) HMAC Calculator
3) AES Calculator
4) RSA Calculator
5) Base64 / Hex Calculator
6) File Hash Calculator

cls / clear) Clear the screen
0 / exit)    Exit the program
`)

        fmt.Print("Enter your choice: ")
        choice, _ := reader.ReadString('\n')
        choice = strings.TrimSpace(strings.ToLower(choice))

        switch choice {

        case "1", "hash":
            hashcalc.Run()

        case "2", "hmac":
            hmaccalc.Run()

        case "3", "aes":
            aescalc.Run()

        case "4", "rsa":
            rsacalc.Run()

        case "5", "base":
            basecalc.Run()

        case "6", "filehash":
            filehash.Run()

        case "clear", "cls":
            fmt.Print("\033[H\033[2J") // Clears most terminals

        case "0", "exit":
            utils.Separator()
            fmt.Println("Exiting program. Goodbye!")
            utils.Separator()
            return

        default:
            fmt.Println("Invalid choice. Please try again.")
        }
    }
}