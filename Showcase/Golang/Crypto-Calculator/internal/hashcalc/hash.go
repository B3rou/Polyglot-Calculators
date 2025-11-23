// Author: Vishwas Karode (GitHub: vishwasio)

package hashcalc

import (
	"crypto/md5"
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
    fmt.Println("                     HASH CALCULATOR")
    utils.Separator()

    algo := input.Prompt("Select algorithm (md5 / sha1 / sha256 / sha512)", "sha256")
    data := input.Prompt("Enter text to hash", "hello world")

    algo = strings.ToLower(algo)

    var hash []byte

    switch algo {
    case "md5":
        h := md5.Sum([]byte(data))
        hash = h[:]

    case "sha1":
        h := sha1.Sum([]byte(data))
        hash = h[:]

    case "sha256":
        h := sha256.Sum256([]byte(data))
        hash = h[:]

    case "sha512":
        h := sha512.Sum512([]byte(data))
        hash = h[:]

    default:
        fmt.Println("Unknown algorithm.")
        return
    }

    utils.Separator()
    fmt.Printf("Output (%s):\n%s\n", algo, hex.EncodeToString(hash))
    utils.Separator()

    fmt.Print("Press ENTER to continue...")
    fmt.Scanln()
}
