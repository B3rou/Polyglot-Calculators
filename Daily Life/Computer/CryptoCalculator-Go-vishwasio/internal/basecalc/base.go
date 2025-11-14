// Author: Vishwas Karode (GitHub: vishwasio)

package basecalc

import (
	"encoding/base64"
	"encoding/hex"
	"fmt"
	"strings"

	"CryptoCalculator-Go-vishwasio/internal/input"
	"CryptoCalculator-Go-vishwasio/internal/utils"
)

func Run() {
    utils.Separator()
    fmt.Println("                BASE64 / HEX CALCULATOR")
    utils.Separator()

    mode := input.Prompt("Select operation (b64encode / b64decode / hexencode / hexdecode)", "b64encode")
    text := input.Prompt("Enter input text", "hello")

    mode = strings.ToLower(mode)

    utils.Separator()
    switch mode {

    case "b64encode":
        fmt.Println("Output:", base64.StdEncoding.EncodeToString([]byte(text)))

    case "b64decode":
        decoded, _ := base64.StdEncoding.DecodeString(text)
        fmt.Println("Output:", string(decoded))

    case "hexencode":
        fmt.Println("Output:", hex.EncodeToString([]byte(text)))

    case "hexdecode":
        decoded, _ := hex.DecodeString(text)
        fmt.Println("Output:", string(decoded))

    default:
        fmt.Println("Invalid operation")
    }
    utils.Separator()

    fmt.Print("Press ENTER to continue...")
    fmt.Scanln()
}