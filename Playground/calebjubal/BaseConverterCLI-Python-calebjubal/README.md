# BaseConverter-Python-calebjubal

Simple integer base converter supporting: binary (bin), octal (oct), decimal (dec), hexadecimal (hex).

Usage (interactive):

Run the script:

```powershell
python .\BaseConverter-Python-calebjubal\main.py
```

Then at the prompt type commands like:

- convert 1010 bin dec    -> 10
- convert 15 dec hex      -> F
- convert 77 oct bin      -> 111111
- convert 1F hex dec      -> 31

Type `help` for examples or `exit` to quit.

Notes:
- Only integer conversions are supported (no fractional parts).
- Negative integers are supported (leading `-`).
