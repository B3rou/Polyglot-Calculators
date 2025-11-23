# 🤝 Contributing to Polyglot-Calculators

Thank you for your interest! 🧡
This repository is a **hybrid** space: it serves as both a learning sandbox for beginners and an engineering showcase for experts.

---

## ‼️ Important First Step
Before contributing, please make sure your Git is configured correctly so your profile picture appears in our contributors list!

```bash
git config --global user.name "YourNickname"
git config --global user.email "YOUR@MAIL.com"
```

---

## 🗺️ Where Should I Put My Code?
This is the most important part.

Please follow this tree structure strictly to avoid your PR being rejected:

```
Polyglot-Calculators/
├── 🏆 Showcase/
│   ├── 🐍 Python/
│   │   └── ProjectName/
│   ├── ⚙️ C/
│   │   └── ProjectName/
│   └── ...       
│
├── 🛝 Playground/
│   ├── 👤 B3rou/
│   ├── 👤 YourUsername/
│   │   └── It's your space!
│   └── ...
└── ...
```

### 1️⃣ 🛝 The Playground (Beginners)
* **Goal:** Learning Git, PRs, testing simple scripts, "Good First Issues", Experiencing Contributing.
* **Rule:** Go to `Playground/` and **create a folder with your GitHub Username**.
* **Expectation:** It doesn't have to be perfect, code optimization is optional.
* **Requirement:** However, **Your code must successfully run or compile without errors.** (Automated checks are coming soon 🚧. For now, manual review is active)

### 2️⃣ 🏆 The Showcase (Advanced)
* **Goal:** High-quality, production-ready engineering tools -- ready to use on projects as source code.
* **Rule:** Go to `Showcase/Language` and create a folder with the **Project Name**.
* **Strictness:** Code **MUST** include Unit Tests and Documentation (README.md etc.). No bugs allowed.
* **Niche**: Provide extra details, informations if your project is so niche that people would struggle to understand.

---

## 🚫 What We Do NOT Accept
To keep the repository clean and fast (we have automated CI checks):
* ❌ **No Binaries:** Do not upload `.exe`, `.o`, `.dll`, `__pycache__`, or `node_modules`.
* ❌ **Root Files:** Do not place any source files, scripts, or project folders in the root directory.
The root is reserved for configuration files only (README, LICENSE, workflows, etc.).
* ❌ **Broken Code:** Your code must run. (Our bots will test it!).

---

## 🧠 Contribution Steps
1.  **Fork** this repository.
2.  **Create** a branch for your feature.
3.  **Navigate** to the correct folder (`Playground/YourName` or `Showcase/Language/`).
4.  **Add** your files.
5.  **Commit** with a meaningful message (e.g., `feat: added matrix calculator to playground`).
6.  **Push** to your fork.
7.  **Open a Pull Request (PR)**.

---

## ⚙️ Code Guidelines
* **Language:** Please use **English** for variable names and comments.
* **Format:** If possible, format your code (e.g., standard indentation).
* **Testing:** If you are contributing to `Showcase`, tests are mandatory.


---

## 🧡 A Note from the Maintainer
Whether you are here to learn Git by adding a simple script to the **Playground**, or here to show off your engineering skills in the **Showcase**, you are welcome.

If your PR is rejected, don’t worry! -- We always explain why so you can improve next time.

First PR? No problem -- everyone starts somewhere!

### ⭐ Let’s build the ultimate polyglot collection together!