package lesson7.strategy_ex_2;

import static lesson7.strategy_ex_2.MessageTemplateType.*;

public class WhatsappTemplate implements MessageTemplate {
    @Override
    public MessageTemplateType getType() {
        return WHATSAPP;
    }

    @Override
    public String getMessage(String rowMessage) {
        return "whatsapp: " + rowMessage;
    }
}
