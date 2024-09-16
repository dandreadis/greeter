# greeter examples

Those examples demonstrate basic concepts behind the Quarkus/Langchain4j integration.

* Using AIServices to model interactions with LLMs
* Choosing different model providers through extensions
* Prompting using @User and @System annotations
* Passing parameters to prompts (Qute templates)
* How chat memory works with stateless LLMs
* Configuring logging to reveal LLMs interactions
* Understanding the basics of LLM function calls
* Getting simple invocations metrics 
* Applying failover functionalithy to LLM calls
* Exploring the DevUI support for LLMs
* Retrieval Augmented Generation with EasyRAG

The openai, ollama & podman directories contain the
same finshed example but configured for different model
providers, each one serving whichever is the defaul
provided LLM.

The ragbot example is different, and implements a simple
chatbot using EasyRAG, that can be queried on information
that the LLM has not be trained on.

The openai & ragbot example need you to have access
to the OpenAI API. For that you need a valid API
key configured in your local enviroment using the
QUARKUS_LANGCHAIN4J_OPENAI_API_KEY env variable.

Ollama requires ollama to be installed/running. Podman requires a model to be served through Podman/AI. GPU
accellation is really advised for those local inference
points, or it will be really slow.

Have fun!
