package lesson8.generics.functional_interfaces;

@FunctionalInterface
public interface CustomFuncInterface<Claims> {
    void doSmt(Claims data);
}
