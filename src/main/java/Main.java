import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args)
    {
        Gson gson = new Gson();
        Question[] questions = null;

        try {
            questions = gson.fromJson(Files.readString(Paths.get("questions.json")),Question[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Question question : questions) {
            System.out.println(
                    ConsoleColors.BLUE_BOLD_BRIGHT + question.Title + '\n' + ConsoleColors.YELLOW +
                    question.AnswerA + '\n' +
                    question.AnswerB + '\n' +
                    question.AnswerC + '\n' +
                    question.AnswerD + '\n' +
                    ConsoleColors.GREEN + "Correct Answer: " + ConsoleColors.GREEN_UNDERLINED + question.CorrectAnswer + '\n' + ConsoleColors.RESET);
        }
    }
}
