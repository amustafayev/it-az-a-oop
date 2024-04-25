package lesson6.sdf_ex.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class FileManager {

    public static void main(String[] args) {
        File file = new File("test2.txt");
        try {
//            file.createNewFile();
//            FileWriter fileWriter = new FileWriter(file);
//
//            fileWriter.write("Test test test");
//            fileWriter.close();
//
//            FileReader fileReader = new FileReader(file);
//            int i;
//            while((i=fileReader.read())!=-1)
//                System.out.print((char)i);
//            fileReader.close();


            //--------------Write-----------------

            Path path = Paths.get("newtest.txt");
            //Fayl acilir
            LocalDateTime start = LocalDateTime.now();
//            for (int i = 0; i < 10000; i++) { slow for loop start
            OutputStream outputStream = Files.newOutputStream(
                    path,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );

            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(outputStream)
            );
            for (int i = 0; i < 10000; i++) {
                bufferedWriter.write("test data " + i + "\n");
            }
            //Fayl baglanir
            bufferedWriter.close();
//            } slow for loop ends
            LocalDateTime end = LocalDateTime.now();

            long between = ChronoUnit.MILLIS.between(start, end);
            System.out.println(between);

            //-----------------Read----------------
//
//            InputStream inputStream = Files.newInputStream(path,
//                    StandardOpenOption.READ,
//                    StandardOpenOption.DELETE_ON_CLOSE);
//
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//
//            String line;
//            while ((line = bufferedReader.readLine()) != null){
//                System.out.println(line);
//            }
//            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
