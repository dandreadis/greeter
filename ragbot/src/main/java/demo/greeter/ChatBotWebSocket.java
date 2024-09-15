package demo.greeter;

import io.quarkus.websockets.next.OnOpen;
import io.quarkus.websockets.next.OnTextMessage;
import io.quarkus.websockets.next.WebSocket;

@WebSocket(path = "/chatbot")
public class ChatBotWebSocket {

    private final Bot bot;

    public ChatBotWebSocket(Bot bot) {
        this.bot = bot;
    }

    @OnOpen
    public String onOpen() {
        return "Hello, I'm your friendly Greeter, how can I help you?";
    }

    @OnTextMessage
    public String onMessage(String message) {
        try {
            return bot.chat(message);
        } catch (NumberFormatException e) {
            // 
            return "";
        }
    }

}
