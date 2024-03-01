import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyDictionary {
    public static void main(String[] args) {
        // проверка наличия двух аргументов командной строки (входной и выходной файл)
        if (args.length != 2) {
            System.out.println("You need to type in command line: java FrequencyDictionary inputFileName outputFileName");
            return;
        }

        // получение имён входных и выходных файлов из аргументов командной строки
        String inputFileName = args[0];
        String outputFileName = args[1];

        try (Scanner scanner = new Scanner(new File(inputFileName))) {
            // создание Map для хранения частоты встречаемости символов
            Map<Character, Integer> charFrequency = new HashMap<>();

            // чтение файла построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
                    }
                }
            }

            // запись результатов подсчета частоты встречаемости символов в выходной файл
            try (PrintWriter writer = new PrintWriter(outputFileName)) {
                for (char c = 'A'; c <= 'Z'; c++) {
                    int frequency = charFrequency.getOrDefault(c, 0);
                    writer.println(c + ": " + frequency);
                }
                for (char c = 'a'; c <= 'z'; c++) {
                    int frequency = charFrequency.getOrDefault(c, 0);
                    writer.println(c + ": " + frequency);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Output file not found: " + outputFileName);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFileName);
        }
    }
}
