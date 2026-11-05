# VS Code + Maven + Git Practice

Java 17 Maven project for practicing dependency management, JUnit 5 tests, and Git collaboration in Visual Studio Code.

## Requirements
- JDK 17
- Apache Maven 3.9+
- Visual Studio Code
- Extension Pack for Java
- Maven for Java

## Commands
```bash
mvn -version
mvn clean test
mvn package
mvn exec:java -Dexec.mainClass="com.example.Main"
```

If the exec plugin is not configured, run the compiled class with:
```bash
java -cp target/classes com.example.Main
```

## Project structure
- `src/main/java`: application source code
- `src/test/java`: JUnit tests
- `src/main/resources`: resources
- `pom.xml`: Maven configuration and dependencies
- `target/`: generated build output
