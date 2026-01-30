# GitHub Copilot / AI agent instructions for this repo ✅

## Purpose
This repo contains a minimal Java project (linked-list skeleton). The goal for AI agents is to be immediately productive implementing core data-structure code, adding small tests, and keeping the repo small and runnable without adding heavy build tooling.

---

## Big picture (what to know quickly) 🔍
- Key files: `Nodo.java` (node), `Liste.java` (list implementation), `Main.java` (manual/entrypoint). Files are currently empty placeholders.
- Expected intent: a simple singly-linked list implementation where `Nodo` represents a node and `Liste` exposes list operations used by `Main`.
- No package declarations or build tools (Maven/Gradle) are present — classes are top-level in the default package.

---

## Rules & conventions specific to this project 📏
- Keep classes top-level in the default package unless you update all files and tests consistently.
- Class name must match filename (Java requirement): `Liste` in `Liste.java`, `Nodo` in `Nodo.java`, `Main` in `Main.java`.
- Keep the public API small and obvious: prefer methods such as `addFirst`, `addLast` (or `insert`), `remove`, `get`, `size`, `isEmpty`, and `toString` for debugging.
- Use simple primitive types for element payloads (e.g., `int`) unless you explicitly refactor to generics across the codebase and tests.

---

## Build / run / test (explicit commands) ⚙️
- Compile (quick local check):
  - `javac *.java`
- Run the entrypoint:
  - `java Main`
- If you add tests using JUnit without adding Maven/Gradle, include a small `run-tests.sh` showing how to compile & run with the JUnit JARs.
- Preferred lightweight approach: keep the project runnable via `javac`/`java` unless the change adds enough complexity to justify a build tool.

---

## Typical changes an agent should make ✅
- Implement a basic `Nodo` class (`data`, `next`) and a `Liste` class that manipulates `Nodo` nodes.
- Add a clear, minimal `Main` example exercising the public `Liste` API (construction, add, remove, print).
- Add unit tests for core behaviors (size, add, remove, boundary cases). Use JUnit 5 if adding a test framework and document how to run them.
- Update `README.md` with usage and compile/run commands.

---

## Good commit/PR practices for the agent 📝
- Keep changes small and focused (one data-structure feature or test per commit).
- Include a `README` snippet showing how to compile and run your change using `javac`/`java`.
- Add tests that compile with `javac` and run with `java` (or document JUnit steps if using a test framework).

---

## When stuck or uncertain ❓
- Run `javac *.java` to see compilation errors and adjust class signatures accordingly.
- If you plan to introduce packages or generics, update all files and `Main` consistently and add instructions in `README.md`.

---

If anything in these instructions is unclear or you'd like a different level of detail (e.g., example method signatures, preferred unit test style), tell me which section to expand and I'll iterate. 💬