package lesson7.strategy_ex_2;

public interface MessageTemplate {
    MessageTemplateType getType();
    String getMessage(String rowMessage);
}
