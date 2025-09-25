# Java Interview Exercises

A small Spring Boot project with bite-sized exercises to practice common Java topics: OOP, mapping, JPA, and design patterns.

## Requirements
- Java 21
- Gradle (wrapper provided)

## Getting Started
```bash
# Windows PowerShell
./gradlew.bat clean test

# macOS/Linux
./gradlew clean test
```

## Project Structure

- `src/main/java/com/albs/inerview/oop`
  - `Greeter`, `PoliteGreeter`
  - Focus: method overloading/overriding, polymorphism.

- `src/main/java/com/albs/inerview/mapping`
  - `User`, `UserDto`, `ManualUserMapper`
  - Focus: DTO ↔ entity mapping.

- `src/main/java/com/albs/inerview/jpa`
  - `domain/Parent`, `domain/Child` JPA entities
  - `service/ParentService`
  - Focus: JPA mappings, one-to-many and many-to-one relations, service layer.

- `src/main/java/com/albs/inerview/patterns`
  - `GlobalRegistry`, `GlobalRegistryHolder`, `GlobalRegistryDcl`
  - Focus: Singleton patterns (eager, holder idiom, double-checked locking).

## Exercises

1) OOP Polymorphism
   - Understand how method selection works across `Greeter` and `PoliteGreeter`.

2) Mapping
   - See `ManualUserMapper` for simple manual mapping between `UserDto` and `User`.

3) JPA Relationships
   - `Parent` ↔ `Child` demonstrate `@OneToMany` and `@ManyToOne`.
   - `Parent#addChild` maintains the bidirectional consistency.

4) Singleton Patterns
   - Compare implementations in `patterns/` and discuss trade-offs (eager vs lazy, thread-safety).

## Lombok & MapStruct
- Lombok is enabled (see `build.gradle.kts`) for `@Getter`, `@Setter`, and constructor annotations in services/entities where appropriate.
- MapStruct dependencies are present for mapping examples (though mapping is manual in this repo for illustration).

## Running Tests
```bash
# Windows
./gradlew.bat test

# macOS/Linux
./gradlew test
```

