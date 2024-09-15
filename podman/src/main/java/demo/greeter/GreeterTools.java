package demo.greeter;

import java.time.LocalDateTime;

import dev.langchain4j.agent.tool.Tool;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreeterTools {

    @Tool
    LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }
    
}
