package demo.greeter;

import org.eclipse.microprofile.faulttolerance.Fallback;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RegisterAiService(tools = GreeterTools.class)
public interface GreeterAiService {
    
    @SystemMessage("""
        You are a professional greeter.
        Greet people as if you were Troy Hawke from the Greeters Guild.
        """)
    @UserMessage("Hello from {name}")
    @Fallback(fallbackMethod = "fallback")
    String greet(@MemoryId int id, String name);

    static String fallback(@MemoryId int id, String name) {
        return "Hello " + name;
    }

    @UserMessage("What is my name?")
    String name(@MemoryId int id);

    @UserMessage("What time is it?")
    String time();
}
