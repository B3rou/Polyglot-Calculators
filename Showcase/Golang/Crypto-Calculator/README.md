# Crypto Calculator (Go)

A modular, interactive multi-tool **cryptography calculator** written in Go.

> **Author:** Vishwas Karode  
> **GitHub:** [vishwasio](https://github.com/vishwasio)

This calculator allows users to compute hashes, HMACs, AES encryption/decryption, RSA signing and verification, Base64/Hex conversions, and file hashing — all through a clean interactive CLI.

---

## 🚀 Features

### 🔐 Cryptographic Calculators

- **Hash Calculator**
  - MD5, SHA1, SHA256, SHA512
- **HMAC Calculator**
  - HMAC-SHA1, HMAC-SHA256, HMAC-SHA512
- **AES Calculator**
  - AES-256-GCM encryption & decryption
- **RSA Calculator**
  - Key generation (2048-bit)
  - Message signing (PSS)
  - Signature verification
- **Base64 / Hex Calculator**
  - Encode / Decode text
- **File Hash Calculator**
  - SHA256 & MD5 file integrity hashing

---

## 📂 Project Structure

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

---

## ▶️ Running the Application

### Run directly:

```bash
go run ./cmd/CryptoCalculator-Go-vishwasio

```

### Run the standalone executable:

```bash
Windows:

CryptoCalculator.exe

Linux/Mac:

./CryptoCalculator
```

> "To run the standalone executalbe, use this command(s) in the same directory as the file.

---

🌟 Interactive CLI Preview

                  CRYPTO CALCULATOR (v1)

Choose what you want to calculate:

1. Hash Calculator
2. HMAC Calculator
3. AES Calculator
4. RSA Calculator
5. Base64 / Hex Calculator
6. File Hash Calculator

cls / clear) Clear the screen

0 / exit) Exit the program

---

## 🛠 Requirements

Go 1.22+

A terminal that supports ANSI escape codes (for clear screen)

---

## 📈 Future Enhancements (v2+)

AES-CBC, AES-CTR, ChaCha20-Poly1305

RSA-OAEP encryption/decryption

SHA3 / BLAKE2 hashing

PBKDF2 / Scrypt / Argon2

File encryption/decryption

Key export/import

Colorful TUI interface

Plugin system

---

## 🤝 Contributing

Contributions are welcome!

Follow the project(s) contribution guidelines.
