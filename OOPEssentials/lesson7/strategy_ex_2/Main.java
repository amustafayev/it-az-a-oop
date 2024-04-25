package lesson7.strategy_ex_2;

import java.util.Arrays;
import java.util.List;

import static lesson7.strategy_ex_2.MessageTemplateType.*;

public class Main {
    private static List<MessageTemplate> messageTemplates = Arrays.asList(
            new InstagramTemplate(),
            new TelegramTemplate(),
            new WhatsappTemplate()
    );

    public static void main(String[] args) {
        Main main = new Main();
        main.sendMessage("test", WHATSAPP);
        main.sendMessage("testwwww", TELEGRAM);
    }


    public void sendMessage(String message, MessageTemplateType messageTemplateType) {
        MessageTemplate messageTemplate = null;
        for (MessageTemplate mt : messageTemplates) {
            if (mt.getType() == messageTemplateType){
                messageTemplate = mt;
            }
        }

        //Memory
//        switch (messageTemplateType) {
//            case WHATSAPP -> messageTemplate = new WhatsappTemplate();
//            case TELEGRAM -> messageTemplate = new TelegramTemplate();
//            case INSTAGRAM -> messageTemplate = new InstagramTemplate();
//        }

        String newMessage = messageTemplate.getMessage(message);

        System.out.println("Send message: ");
        System.out.println(newMessage);

    }
}
