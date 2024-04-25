package lesson7.exceptions;

import lesson7.exceptions.custom_ex.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp {

    public static void main(String[] args) {
        //Exception types:
        //1. Checked ex.
        //2. Unchecked ex.

//
//        Scanner scanner = new Scanner(System.in);
//
//        int a = 30;
//        int b = scanner.nextInt();
//
//        System.out.println(a / b);
//
//        writeFile();

        System.out.println(interviewQuestion());


        try {
            someLogic();
        } catch (ProductException exception) {
            System.out.println("Error handled: " + exception.getMessage() +
                    " ex code: " + exception.getExceptionCode());
        } catch (UserExceptions exceptions) {
            System.out.println("User exception handled: " + exceptions.getMessage());
        } catch (BusinessLogicException businessLogicException) {
            System.out.println("Business logic exception " + businessLogicException.getMessage());
        }
    }

    private static void someLogic() {
        someLogic2();
        throw new UserInvalidException("User invalid exception");
    }

    private static void someLogic2() {
        someLogic3();
    }

    private static void someLogic3() {
        throw new ProductNotFoundException("Product not found", "404");
    }

    private static void writeFile() {

        File file = new File("test.txt");

        try (FileReader fileReader = new FileReader(file)) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {

        }


        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
//        } catch (Exception e) { // Bad Practice
        } catch (FileNotFoundException e) {
            System.out.println("Error happened");
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static int interviewQuestion() {
        try {
            System.out.println("try worked ");
            return 1;
        } catch (Exception e) {
            System.out.println("except worked ");
            return 2;
        } finally {
            System.out.println("finally worked ");
            return 3;
        }
    }
}
