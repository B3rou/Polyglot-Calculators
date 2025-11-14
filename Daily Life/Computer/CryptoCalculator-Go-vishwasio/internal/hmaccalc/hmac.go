// Author: Vishwas Karode (GitHub: vishwasio)

package hmaccalc

import (
	"crypto/hmac"
	"crypto/sha1"
	"crypto/sha256"
	"crypto/sha512"
	"encoding/hex"
	"fmt"
	"strings"

	"CryptoCalculator-Go-vishwasio/internal/input"
	"CryptoCalculator-Go-vishwasio/internal/utils"
)

func Run() {
    utils.Separator()
    fmt.Println("                     HMAC CALCULATOR")
    utils.Separator()

    algo := input.Prompt("Select algorithm (sha1 / sha256 / sha512)", "sha256")
    msg := input.Prompt("Enter message", "hello world")
    secret := input.Prompt("Enter secret key", "mysecretkey123")

    algo = strings.ToLower(algo)

    var mac []byte

    switch algo {
    case "sha1":
        h := hmac.New(sha1.New, []byte(secret))
        h.Write([]byte(msg))
        mac = h.Sum(nil)

    case "sha256":
        h := hmac.New(sha256.New, []byte(secret))
        h.Write([]byte(msg))
        mac = h.Sum(nil)

    case "sha512":
        h := hmac.New(sha512.New, []byte(secret))
        h.Write([]byte(msg))
        mac = h.Sum(nil)

    default:
        fmt.Println("Unknown algorithm.")
        return
    }

    utils.Separator()
    fmt.Printf("Output (%s):\n%s\n", algo, hex.EncodeToString(mac))
    utils.Separator()

    fmt.Print("Press ENTER to continue...")
    fmt.Scanln()
}
