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

func EncryptAES(plaintext string, key []byte) (ciphertext []byte, nonce []byte, err error) {
	if len(key) != 32 {
		return nil, nil, fmt.Errorf("key must be 32 bytes")
	}

	block, err := aes.NewCipher(key)
	if err != nil {
		return nil, nil, err
	}

	gcm, err := cipher.NewGCM(block)
	if err != nil {
		return nil, nil, err
	}

	nonce = make([]byte, gcm.NonceSize())
	_, err = io.ReadFull(rand.Reader, nonce)
	if err != nil {
		return nil, nil, err
	}

	ciphertext = gcm.Seal(nil, nonce, []byte(plaintext), nil)
	return ciphertext, nonce, nil
}

func DecryptAES(ciphertext []byte, nonce []byte, key []byte) (string, error) {
	if len(key) != 32 {
		return "", fmt.Errorf("key must be 32 bytes")
	}

	block, err := aes.NewCipher(key)
	if err != nil {
		return "", err
	}

	gcm, err := cipher.NewGCM(block)
	if err != nil {
		return "", err
	}

	plaintext, err := gcm.Open(nil, nonce, ciphertext, nil)
	if err != nil {
		return "", err
	}

	return string(plaintext), nil
}

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
