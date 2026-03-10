# MavenAssignment

A Java Maven project demonstrating CI/CD concepts with Jenkins.

## What It Does

This program takes a user input string and:
1. **Capitalizes** the first letter of each word using Apache Commons Lang
2. **Generates an MD5 hash** of the capitalized string

### Example Output
```
=== MavenAssignment v3.11.8 (Jenkins CI/CD Demo) ===
This program will capitalize the input string and generate MD5 hex!

Enter a string: hello world

 Capitalized string is: Hello World

 MD5 Hex is: b10a8db164e0754105b7a99be72e3fe5
```

## Tech Stack

- **Java 11+** (compiled with JDK 21)
- **Maven 3.9** for build management
- **Apache Commons Lang 3.12** for string utilities
- **Apache Commons Codec 1.11** for encoding
- **JUnit** for testing

## Build & Run

### Build with Maven
```bash
mvn clean package
```

### Run the JAR
```bash
java -jar target/MavenAssingment-3.11.8-shaded.jar
```

## Jenkins CI Pipeline

This project includes a `Jenkinsfile` for automated CI with the following stages:

| Stage | Description |
|-------|-------------|
| **Verify Environment** | Prints Java and Maven versions |
| **Checkout** | Pulls latest code from GitHub |
| **Build and Package** | Compiles and packages the application into a shaded JAR |

### Pipeline Setup
1. Configure JDK and Maven in **Jenkins → Manage Jenkins → Tools**
2. Create a Pipeline job pointing to this repo
3. Jenkins uses the `Jenkinsfile` in the root directory
4. Poll SCM is enabled for automatic builds on every push

## Project Structure

```
MavenAssingment/
├── Jenkinsfile                          # Jenkins pipeline definition
├── pom.xml                              # Maven build configuration
├── README.md
└── src/
    ├── main/java/com/smu/mscda/
    │   └── Main.java                    # Application entry point
    └── test/java/com/smu/mscda/
        └── MainTest.java                # Unit tests
```

## Author

Nikola Kriznar — SMU MSCDA