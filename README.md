# 💻 JavaAdvancedLaptopSearch – Advanced Laptop Search (Java Swing)

A **Java Swing desktop application** for searching and filtering laptops by their hardware specifications.  
The project models a laptop as a composition of components (CPU, GPU, RAM, Disk, Screen, Peripherals) and uses a **JSON file (`db.json`) as its data store**, parsed with **Gson**.

> **Repository description:** *“Advanced laptop search java swing application”*[reference:0]

---

## 📖 Overview

`JavaAdvancedLaptopSearch` is a NetBeans/Ant–based Java project that provides a graphical interface for browsing a catalogue of laptops.  
Instead of treating a laptop as a flat record, the domain model breaks it into separate component classes, making it possible to search and compare machines by individual parts.

The application reads its data from **`db.json`** and uses **Gson 2.8.5** (bundled as `gson-2.8.5.jar`) for JSON serialization/deserialization.  
The UI is built with **Java Swing**, using a NetBeans GUI Builder form (`NewApplication.form` + `NewApplication.java`).

---

## ✨ Features (inferred from the source layout)

- **Swing-based GUI** — entry point and main window in `NewApplication.java` (backed by `NewApplication.form`).
- **Component-level laptop model** — laptops are composed of `CPU`, `GPU`, `RAM`, `Disk`, `Screen`, `Peripherals`, and `Core` objects.
- **Advertisement layer** — `Ad.java` represents a laptop listing/advertisement.
- **Search over a JSON catalogue** — data is loaded from `db.json`; Gson handles the mapping.
- **Project container** — `Project.java` likely holds the collection of loaded ads/laptops and provides search/filter operations.

> **Note:** The exact search predicates (e.g. filter by CPU brand, RAM size, price range) are defined in `Project.java` / `NewApplication.java`. Inspect those files to see the implemented filters.

---

## 🗂️ Repository Structure

```text
JavaAdvancedLaptopSearch/
├── build/                     # Compiled output (generated)
├── dist/                      # Distributable JAR (generated)
├── nbproject/                 # NetBeans project metadata
├── src/
│   └── project/               # All Java source files
│       ├── Ad.java            # Advertisement / listing model
│       ├── CPU.java           # CPU component model
│       ├── Core.java          # CPU core model
│       ├── Disk.java          # Storage component model
│       ├── GPU.java           # Graphics component model
│       ├── Laptop.java        # Laptop aggregate model
│       ├── NewApplication.form# NetBeans GUI form definition
│       ├── NewApplication.java# Main window / application entry point
│       ├── Peripherals.java   # Peripherals component model
│       ├── Project.java       # Project container / search logic
│       ├── RAM.java           # Memory component model
│       └── Screen.java        # Display component model
├── build.xml                  # Ant build script
├── db.json                    # JSON data store (laptop catalogue)
├── gson-2.8.5.jar             # Gson library (JSON parsing)
├── manifest.mf                # JAR manifest
├── desktop.ini                # Windows folder settings (artefact)
└── README.md
```

---
## 🛠️ Technologies

| Item              | Details                                                    |
| ----------------- | ---------------------------------------------------------- |
| **Language**      | Java (Swing)                                               |
| **GUI framework** | Java Swing (NetBeans GUI Builder, `.form` file)            |
| **Build system**  | Apache Ant (`build.xml`) + NetBeans project (`nbproject/`) |
| **JSON library**  | Gson 2.8.5 (`gson-2.8.5.jar`)                              |
| **Data store**    | `db.json` (flat-file JSON database)                        |
| **IDE**           | NetBeans (project metadata included)                       |

---
## 🚀 Getting Started

### Prerequisites

- **Java JDK 8+** (the Gson 2.8.5 jar and the project layout are compatible with Java 8 and later).
- **NetBeans** (recommended, because `nbproject/` and `NewApplication.form` are NetBeans artefacts).
- Alternatively: **Apache Ant** for command-line builds.

### Run from NetBeans

1. **Open the project** in NetBeans (`File → Open Project` → select the repository folder).
2. Ensure `gson-2.8.5.jar` is on the project’s classpath (it is already in the repo root).
3. Press **Run (F6)**.  
    The main class is `project.NewApplication`.

---
## 📊 Data Model (`db.json`)

The application’s catalogue lives in `db.json`.  
Each entry is expected to map to a `Laptop` / `Ad` object containing nested component objects (`CPU`, `GPU`, `RAM`, `Disk`, `Screen`, `Peripherals`).  
Gson deserializes the file into these classes at startup.

To **add a laptop**, append a new JSON object to `db.json` that follows the same schema as the existing entries.  
To **change the schema**, update the corresponding Java model classes and the JSON together.

---
## 🧠 How It Works (high level)

1. **Startup** — `NewApplication.main()` launches the Swing window.
2. **Data loading** — Gson reads `db.json` and populates the model objects (`Laptop`, `Ad`, component classes).
3. **Search** — `Project` holds the loaded laptops and exposes the filtering logic.  
    The Swing UI collects user criteria and asks `Project` for matching laptops.
4. **Display** — matching `Laptop` objects are rendered in the Swing components (lists, tables, or detail panels).

Because the model is **component-based** (`CPU`, `GPU`, `RAM`, `Disk`, `Screen`, `Peripherals`), searches can target specific hardware attributes rather than a single opaque “specs” string.

---
## 📝 Notes & Caveats

- **`db.json` is the single source of truth** — there is no external database server.
- **NetBeans GUI form** — `NewApplication.form` is a NetBeans GUI Builder file. If you edit `NewApplication.java` by hand, keep the generated `initComponents()` method consistent (or open the form in NetBeans’ GUI editor).
- **`gson-2.8.5.jar` is bundled** — no dependency manager (Maven/Gradle) is used; the JAR is committed directly to the repo.
- **Generated folders** — `build/` and `dist/` contain compiled output; they can be deleted and regenerated with Ant or NetBeans.

---
## 🤝 Contributing

Issues and pull requests are welcome — e.g. adding new search filters, extending the component model (battery, ports, weight), migrating `db.json` to a proper database, or replacing the manual classpath setup with Maven/Gradle.

---
## 📄 License

Feel Free To Use :)
