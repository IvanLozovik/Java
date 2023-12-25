import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.sound.midi.MidiDevice.Info;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;
    static Logger logger = Logger.getLogger(BubbleSort.class.getName());
    String filePath = "JAVA_DZ_02/test.txt";
    String logPath = "JAVA_DZ_02/log.txt";

    public static void sort(int[] mas) {
       
        for (int i = 0; i < mas.length; i++){
            for (int j = mas.length-1; j > i; j--){
                if (mas[j-1] > mas[j]) {
                    int temp = mas[j-1];
                    mas[j-1] =mas [j];
                    mas[j]=temp;
                }
            }
                System.out.println(Arrays.toString(mas));
            logger.log(Level.INFO, Arrays.toString(mas));
            String res = Arrays.toString(mas);
            createLogger(logPath);
            writeInFile(res, filePath);
            readFile(filePath);        
        }


        closeLogger();
    
        static void createLogger(String logPath){
        try {
            FileHandler handler = new FileHandler(logPath, true);
            logger.addHandler(handler);
            SimpleFormatter formatter = new SimpleFormatter();
            handler.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

        static void closeLogger(){
        Handler[] handlers = logger.getHandlers();
        for (Handler handler: handlers){
            handler.close();
        }
        }

        static void writeInFile(String res, String filePath) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(res);
            writer.write("\n");
            logger.info("Запись прошла успешно");
        } catch (Exception e){
            e.printStackTrace();
            logger.warning("Запись в файл не удалась. " + e.getMessage());
        }
        }

       
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class main2 { 
    public static void main(String[] args) { 
      int[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new int[]{9, 4, 8, 3, 1};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
      }     
      
      BubbleSort ans = new BubbleSort();      
      ans.sort(arr);
      
    //   System.out.println(mas);

      try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}