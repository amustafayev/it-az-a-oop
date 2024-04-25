package lesson7.strategy_ex_2;

import static lesson7.strategy_ex_2.MessageTemplateType.*;

public class InstagramTemplate implements MessageTemplate{
    @Override
    public MessageTemplateType getType() {
        return INSTAGRAM;
    }

    @Override
    public String getMessage(String rowMessage) {
        return "instagram: " + rowMessage;
    }
}
