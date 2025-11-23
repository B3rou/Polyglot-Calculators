// Author: Vishwas Karode (GitHub: vishwasio)

package filehash

import (
	"crypto/md5"
	"crypto/sha256"
	"encoding/hex"
	"fmt"
	"io"
	"os"
	"strings"

	"CryptoCalculator-Go-vishwasio/internal/input"
	"CryptoCalculator-Go-vishwasio/internal/utils"
)

func Run() {
    utils.Separator()
    fmt.Println("                  FILE HASH CALCULATOR")
    utils.Separator()

    algo := input.Prompt("Select algorithm (sha256 / md5)", "sha256")
    filePath := input.Prompt("Enter file path", "example.txt")

    file, err := os.Open(filePath)
    if err != nil {
        fmt.Println("File error:", err)
        return
    }
    defer file.Close()

    algo = strings.ToLower(algo)
    var hash string

    if algo == "sha256" {
        h := sha256.New()
        io.Copy(h, file)
        hash = hex.EncodeToString(h.Sum(nil))

    } else if algo == "md5" {
        h := md5.New()
        io.Copy(h, file)
        hash = hex.EncodeToString(h.Sum(nil))

    } else {
        fmt.Println("Unknown algorithm")
        return
    }

    utils.Separator()
    fmt.Printf("Hash (%s):\n%s\n", algo, hash)
    utils.Separator()

    fmt.Print("Press ENTER to continue...")
    fmt.Scanln()
}
