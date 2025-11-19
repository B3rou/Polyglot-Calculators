# Mass Converter (Java)

A tiny, friendly Java command-line tool to convert common mass units.

Quick start

- Compile:

```powershell
cd "Daily Life\Mass Converters\MassConverter-Java-rohithgowda18"
javac Main.java
```

- Single conversion (one-shot):

```powershell
java Main 500 gram kg
# prints: 0.5
```

- Interactive mode:

```powershell
java Main
# then enter lines like: 2 pound ounce
```

Supported units: `g`, `kg`, `mg`, `lb`, `oz`, `t` (also accepts `ton` / `tonne`).

Examples

- `500 gram kg` → `0.5`
- `2 pound ounce` → `32`
- `1 kilogram pound` → `2.20462`

Contributing

Before committing, set your Git name/email so your contribution is credited:

```powershell
git config --global user.name "YOUR_GITHUB_USERNAME"
git config --global user.email "YOUR_GITHUB_EMAIL"
```

When ready, open a PR referencing the issue. Thank you! ✨
