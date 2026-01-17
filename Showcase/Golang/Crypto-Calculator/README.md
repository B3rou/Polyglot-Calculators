# Crypto Calculator (Go)

A modular, interactive multi-tool **cryptography calculator** written in Go.

> **Author:** Vishwas Karode  
> **GitHub:** [@vishwasio](https://github.com/vishwasio)

---

## 📌 Overview

Crypto Calculator is a command-line based cryptography toolkit written in Go.  
It provides multiple cryptographic utilities such as hashing, HMAC, AES encryption/decryption, RSA operations, Base64/Hex encoding, and file hashing through an interactive menu.

This project is designed to be modular, easy to extend, and suitable for learning and experimentation with cryptography in Go.

---

## 🚀 Features

### 🔐 Cryptographic Calculators

- Hash Calculator
  - MD5, SHA1, SHA256, SHA512
- HMAC Calculator
  - HMAC-SHA1, HMAC-SHA256, HMAC-SHA512
- AES Calculator
  - AES-256-GCM encryption & decryption
- RSA Calculator
  - 2048-bit key generation
  - Message signing (PSS)
  - Signature verification
- Base64 / Hex Calculator
  - Encode and Decode text
- File Hash Calculator
  - MD5 and SHA256 hashing

---

## 📂 Project Structure

```
CryptoCalculator-Go-vishwasio/
│
├── cmd/
│ └── CryptoCalculator-Go-vishwasio/
│ └── main.go
│
├── internal/
│ ├── menu/
│ ├── input/
│ ├── utils/
│ ├── hashcalc/
│ ├── hmaccalc/
│ ├── aescalc/
│ ├── rsacalc/
│ ├── basecalc/
│ └── filehash/
│
└── go.mod
```

---

## 🛠 Requirements

- Go **1.22+**
- Terminal with ANSI escape code support

---

## ▶️ Running the Application

Run the application directly from source:

```bash
go run ./cmd/CryptoCalculator-Go-vishwasio
```

🧪 Running Tests
Run all unit tests from the project root:

```bash
go test ./...
```

Run tests with verbose output:

```bash
go test -v ./... 
```

All tests use Go’s standard testing package and are structured for easy extension.

🌟 CLI Preview
```
CRYPTO CALCULATOR (v1)

Choose what you want to calculate:

1. Hash Calculator
2. HMAC Calculator
3. AES Calculator
4. RSA Calculator
5. Base64 / Hex Calculator
6. File Hash Calculator

cls / clear - Clear the screen
0 / exit - Exit the program
```
📈 Future Enhancements
- AES-CBC, AES-CTR, ChaCha20-Poly1305

- RSA-OAEP encryption/decryption

- SHA3 / BLAKE2 hashing

- PBKDF2 / Scrypt / Argon2

- File encryption/decryption

- Key import/export

- Colorful TUI interface

- Plugin-based calculator system

## 🤝 Contributing

Contributions are welcome!

Follow the project(s) contribution guidelines.

## 🤝 Contributors

- [@vishwasio](https://github.com/vishwasio)
- [@Weberpcc](https://github.com/Weberpcc)
