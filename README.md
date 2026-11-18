# Disney Character Quiz

A high-school AP Computer Science A Java project that combines a terminal Q&A with a five-question character quiz. The quiz branches into classic Disney animation or Marvel and matches your answers to a character.

## Run locally

With JDK 17 or later, run these commands from the repository root:

```sh
javac -encoding UTF-8 -d out scannerFinal.java
java -cp out scannerFinal
```

Ask about a film with a prompt such as `plot of Cinderella`, or type `exit` to start the quiz. Answer each quiz question with `A` or `B`. The conversation continues with two follow-up prompts and an optional trivia round. Type `exit` again to finish.

## Project notes

The quiz uses a branching questionnaire and a rule-based lookup to choose a result. The portfolio revision uses one input reader across all stages, validates quiz choices, and handles end-of-input gracefully.

Built as an AP CSA project. The `high-school-original` tag preserves the imported classroom source and chatbot demo. This is an unofficial fan project.
