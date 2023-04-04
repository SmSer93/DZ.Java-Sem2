// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.logging.*;


public class Task01 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{3, 4, 9, 7, 1, 3, 1, 6, 2,};
        Logger log = Logger.getLogger(Task01.class.getName());
        FileHandler fh = new FileHandler("Log.txt");
        log.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);


        int num = arr.length;
        int temp = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < (num - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                    StringBuilder result = new StringBuilder();
                    for (int k = 0; k < num; k++) {
                        result.append(arr[k]).append(" ");
                    }
                    log.info("Swap  " + temp + " and " + arr[j - 1] + " : " + result);
                }

            }

        }
    }
}
