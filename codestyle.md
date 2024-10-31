# Code Style Guide

This code style guide is derived from mainstream official standards and recommendations from major companies, specifically focusing on Java programming. The following sources were used to compile this guide:

1. [Google Java Style Guide](https://google.github.io/styleguide/jsguide.html)
2. [Oracle Java Code Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html)
3. [Spring Framework Code Style](https://github.com/spring-projects/spring-framework/wiki/Spring-Code-Style)

## 1. Naming Conventions

- **Classes**: Use `PascalCase` (e.g., `ContactService`, `ContactController`).
- **Methods**: Use `camelCase` (e.g., `addContact`, `getAllContacts`).
- **Variables**: Use `camelCase` (e.g., `contactDetails`, `newContact`).
- **Constants**: Use `UPPER_SNAKE_CASE` (e.g., `MAX_CONTACTS`).

## 2. Formatting

- **Indentation**: Use 4 spaces for indentation. Do not use tabs.
- **Line Length**: Limit lines to 100 characters. Break lines that exceed this limit.
- **Blank Lines**: Use a single blank line to separate methods and class declarations.
- **Braces**: Always use braces `{}` for control statements (if, for, while), even for single-line blocks.

## 3. Comments

- Use Javadoc comments for public classes and methods.
- Use inline comments sparingly. They should be clear and concise.
- Document non-obvious code logic.

## 4. Annotations

- Place annotations above the class or method they annotate.
- Use single blank line before the annotation.
