package lesson8.generics;

import lesson2.adapter_pattern.square.SquareToy;
import lesson8.generics.functional_interfaces.CustomFuncInterface;
import lesson8.visitor.shapes.Circle;
import lesson8.visitor.shapes.Dot;
import lesson8.visitor.shapes.Line;
import lesson8.visitor.shapes.Square;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<Integer>();

        data.add(4);
        data.add(5);
        doSmt(data);
//        data.add("8");

        for (int i = 0; i < data.size(); i++) {
//            System.out.println((Integer) data.get(i) + 5);
        }

        System.out.println("------------------------");

        MyList<Integer> myList = new MyList();
        myList.add(5);
//        myList.add('A');
//        myList.add("test");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i) + 5);
        }

        System.out.println("Method level generics");
        System.out.println("----------------------------------");
        System.out.println(wrapper("test"));
        System.out.println(wrapper("test222"));

        System.out.println(wrapper2(34));
        System.out.println(wrapper2("test"));
        System.out.println(wrapper2('A'));
        System.out.println(wrapper2(new SquareToy(343)));

        //public static <T, E> E wrapper3(T data)
        //Argument type: Character, Return Type: String
        String a = wrapper3('A');

        //Argument type: Integer, Return Type: String
        String a2 = wrapper3(3);

        //Argument type: Character, Return Type: String
        String a3 = wrapper3('A');

        //Argument type: Character, Return Type: Character
        Character a4 = wrapper3('A');


        ShapeWrapper sw = new ShapeWrapper();

        sw.shapeWrapper(new Square());
        sw.shapeWrapper(new Line());
//        sw.shapeWrapper(new Dot()); > compile error
//        sw.shapeWrapper(new Circle()); > compile error

        //------------------------

        List<Integer> i1 = new ArrayList<>();
        List<String> i2 = new ArrayList<>();

        process(i1);
        process(i2);

        process2(i1);
        process2(i2);
        //------------------------

        CustomFuncInterface<Integer> customFuncInterface =
                System.out::println;

        customFuncInterface.doSmt(566);

        test(customFuncInterface);


        Consumer<String> consumer = s -> System.out.println("data: " + s);
        Supplier<LocalDateTime> supplier = new Supplier<LocalDateTime>() {
            @Override
            public LocalDateTime get() {
                return LocalDateTime.now();
            }
        };

        Function<Integer, String> function = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return String.valueOf(integer);
            }
        };
    }

    private static void test(CustomFuncInterface<Integer> customFuncInterface) {
        customFuncInterface.doSmt(5);
    }

    public static <T> void process(List<T> data){
        System.out.println(data);
    }


    public static void process2(List<?> data){
        System.out.println(data);
    }


    private static void doSmt(List<Integer> data) {
//        data.add("6"); compile error
    }

    public static String wrapper(String data){
        return "Data: " + data;
    }

    public static <T> String wrapper2(T data){
        return "Data: " + data;
    }

    public static <T, E> E wrapper3(T data) {
        return (E) ("Data: " + data);
    }

}
