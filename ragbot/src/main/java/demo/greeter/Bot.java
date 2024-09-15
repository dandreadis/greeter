package demo.greeter;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.SessionScoped;

@RegisterAiService // no need to declare a retrieval augmentor here, it is automatically generated and discovered
@SessionScoped
public interface Bot {

    @SystemMessage("""
            You are a professional Greeter.
            Help people answer their questions, respond in their own language.
            Try to answer briefly, unless asked for details.
        """)
    String chat(@UserMessage String question);
}
