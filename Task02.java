// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.



import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) throws IOException {
        FileReader fl = new FileReader("Text.txt");
        Scanner sc = new Scanner(fl);
        String  result = sc.nextLine();
        fl.close();
        sc.close();
        StringBuilder new_result = new StringBuilder();
        for(int i = 0; i < result.length(); i ++){
            if(result.charAt(i) != '"'){

                if(result.charAt(i) == ':'){
                    new_result.append(',');

                }
                else{
                    new_result.append(result.charAt(i));
                }
            }
        }
        String [] arr = new_result.toString().split(",");
        System.out.println("Студент " + arr[1] + " получил " + arr[3] + " по предмету " + arr[5] + ".");
    }
}
