// Author: Vishwas Karode (GitHub: vishwasio)

package aescalc

import (
	"crypto/aes"
	"crypto/cipher"
	"crypto/rand"
	"encoding/base64"
	"fmt"
	"io"

	"CryptoCalculator-Go-vishwasio/internal/input"
	"CryptoCalculator-Go-vishwasio/internal/utils"
)

func Run() {
    utils.Separator()
    fmt.Println("                      AES CALCULATOR")
    utils.Separator()

    mode := input.Prompt("Select mode (encrypt / decrypt)", "encrypt")

    if mode == "encrypt" {
        runEncrypt()
    } else if mode == "decrypt" {
        runDecrypt()
    } else {
        fmt.Println("Invalid mode.")
    }
}

func runEncrypt() {
    key := input.Prompt("Enter 32-byte key", "12345678901234567890123456789012")
    text := input.Prompt("Enter plaintext", "hello world")

    if len(key) != 32 {
        fmt.Println("Key must be 32 bytes.")
        return
    }

    block, _ := aes.NewCipher([]byte(key))
    gcm, _ := cipher.NewGCM(block)

    nonce := make([]byte, gcm.NonceSize())
    io.ReadFull(rand.Reader, nonce)

    ciphertext := gcm.Seal(nil, nonce, []byte(text), nil)

    utils.Separator()
    fmt.Println("Ciphertext:", base64.StdEncoding.EncodeToString(ciphertext))
    fmt.Println("Nonce:", base64.StdEncoding.EncodeToString(nonce))
    utils.Separator()

    fmt.Print("Press ENTER to continue...")
    fmt.Scanln()
}

func runDecrypt() {
    key := input.Prompt("Enter 32-byte key", "12345678901234567890123456789012")
    ciphertextB64 := input.Prompt("Enter ciphertext (base64)", "")
    nonceB64 := input.Prompt("Enter nonce (base64)", "")

    ct, _ := base64.StdEncoding.DecodeString(ciphertextB64)
    nonce, _ := base64.StdEncoding.DecodeString(nonceB64)

    block, _ := aes.NewCipher([]byte(key))
    gcm, _ := cipher.NewGCM(block)

    plaintext, err := gcm.Open(nil, nonce, ct, nil)
    if err != nil {
        fmt.Println("Decryption failed.")
        return
    }

    utils.Separator()
    fmt.Println("Decrypted Text:", string(plaintext))
    utils.Separator()

    fmt.Print("Press ENTER to continue...")
    fmt.Scanln()
}
