# Duration Converter (Java)

A small Java command-line duration converter for the Awesome-Calculators collection.

Quick start

- Compile:

```powershell
cd "Daily Life\Time\Duration Converters\DurationConverter-Java-rohithgowda18"
javac Main.java
```

- Single conversion (one-shot):

```powershell
java Main 3600 sec hour
# prints: 1
```

- Interactive mode:

```powershell
java Main
# then enter lines like: 2 hour minute
```

Supported units: `s`/`sec`/`second`, `m`/`min`/`minute`, `h`/`hr`/`hour`, `d`/`day`, `w`/`week`.

Examples

- `3600 sec hour` → `1`
- `2 hour minute` → `120`
- `3 day hour` → `72`

Contributing

Before committing, set your Git name/email so your contribution is credited:

```powershell
git config --global user.name "YOUR_GITHUB_USERNAME"
git config --global user.email "YOUR_GITHUB_EMAIL"
```

When ready, open a PR referencing the issue. Thank you! ⏳✨
