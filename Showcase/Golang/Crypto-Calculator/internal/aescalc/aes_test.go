package aescalc

import "testing"

func TestEncryptDecryptAES(t *testing.T) {
	key := []byte("12345678901234567890123456789012")
	text := "hello world"

	ciphertext, nonce, err := EncryptAES(text, key)
	if err != nil {
		t.Fatalf("EncryptAES failed: %v", err)
	}

	result, err := DecryptAES(ciphertext, nonce, key)
	if err != nil {
		t.Fatalf("DecryptAES failed: %v", err)
	}

	if result != text {
		t.Errorf("Expected %s, got %s", text, result)
	}
}
func TestEncryptAESInvalidKey(t *testing.T) {
	key := []byte("short-key")
	_, _, err := EncryptAES("test", key)

	if err == nil {
		t.Errorf("Expected error for invalid key length")
	}
}

