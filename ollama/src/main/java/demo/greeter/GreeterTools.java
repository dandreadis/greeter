package demo.greeter;

import java.time.LocalDateTime;

import com.ezylang.evalex.EvaluationException;
import com.ezylang.evalex.Expression;
import com.ezylang.evalex.parser.ParseException;

import dev.langchain4j.agent.tool.Tool;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreeterTools {

    @Tool
    LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }
    
    // @Tool
    String evaluateExpression(String expression) {
        Expression expr = new Expression(expression);
        try {
            return expr.evaluate().getNumberValue().toPlainString();
        } catch (EvaluationException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
