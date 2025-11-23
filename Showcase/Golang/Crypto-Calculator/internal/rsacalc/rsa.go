// Author: Vishwas Karode (GitHub: vishwasio)

package rsacalc

import (
	"crypto"
	"crypto/rand"
	"crypto/rsa"
	"crypto/sha256"
	"encoding/base64"
	"fmt"

	"CryptoCalculator-Go-vishwasio/internal/input"
	"CryptoCalculator-Go-vishwasio/internal/utils"
)

var privateKey *rsa.PrivateKey
var publicKey rsa.PublicKey

func Run() {
    utils.Separator()
    fmt.Println("                      RSA CALCULATOR")
    utils.Separator()

    mode := input.Prompt("Select operation (keygen / sign / verify)", "keygen")

    if mode == "keygen" {
        keygen()
    } else if mode == "sign" {
        signMsg()
    } else if mode == "verify" {
        verifyMsg()
    } else {
        fmt.Println("Invalid choice.")
    }
}

func keygen() {
    pk, _ := rsa.GenerateKey(rand.Reader, 2048)
    privateKey = pk
    publicKey = pk.PublicKey

    utils.Separator()
    fmt.Println("RSA 2048-bit keys generated successfully.")
    utils.Separator()

    fmt.Print("Press ENTER to continue...")
    fmt.Scanln()
}

func signMsg() {
    if privateKey == nil {
        fmt.Println("Please generate keys first (keygen).")
        return
    }

    msg := input.Prompt("Enter message to sign", "hello")
    hash := sha256.Sum256([]byte(msg))

    signature, _ := rsa.SignPSS(rand.Reader, privateKey, crypto.SHA256, hash[:], nil)

    utils.Separator()
    fmt.Println("Signature:", base64.StdEncoding.EncodeToString(signature))
    utils.Separator()

    fmt.Print("Press ENTER to continue...")
    fmt.Scanln()
}

func verifyMsg() {
    if privateKey == nil {
        fmt.Println("Please generate keys first (keygen).")
        return
    }

    msg := input.Prompt("Enter message", "hello")
    sigB64 := input.Prompt("Enter signature (base64)", "")

    signature, _ := base64.StdEncoding.DecodeString(sigB64)

    hash := sha256.Sum256([]byte(msg))

    err := rsa.VerifyPSS(&publicKey, crypto.SHA256, hash[:], signature, nil)
    
    utils.Separator()
    if err == nil {
        fmt.Println("Signature is VALID.")
    } else {
        fmt.Println("Signature is INVALID.")
    }
    utils.Separator()

    fmt.Print("Press ENTER to continue...")
    fmt.Scanln()
}
