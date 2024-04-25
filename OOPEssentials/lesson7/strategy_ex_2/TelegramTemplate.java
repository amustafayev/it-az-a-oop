package lesson7.strategy_ex_2;

import static lesson7.strategy_ex_2.MessageTemplateType.TELEGRAM;

public class TelegramTemplate implements MessageTemplate{
    @Override
    public MessageTemplateType getType() {
        return TELEGRAM;
    }

    @Override
    public String getMessage(String rowMessage) {
        return "telegram: " + rowMessage;
    }
}
