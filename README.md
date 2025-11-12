# Simple chat ia

## Docker
Este proyecto muestra la configuracion y ejecución de un java interactuando con un contenedor docker de ollama con un modelo de lenguaje embebido

En este caso usamos mistral:latest

Para hacer funcionar en local este proyecto necesitas docker y ejecutar el docker compose que está en la raiz del proyecto

`docker-compose up` desde la consola

Cuando esté corriendo en docker puedes acceder a la consola del contendor y ejecutar:

`ollama pull nombreModelo`

Para descargar el modelo para posteriormente usarlo

Aqui tienes algunos ejemplos de modelos:          
 - mistral:latest 
 - qwen3:30b-a3b  
 - qwen3:30b      
 - qwen3:32b      
 - qwen3:14b      
 - qwen3:8b       
 - gemma3:27b     
 - qwen2.5:7b     
 - deepseek-r1:32b
 - deepseek-r1:14b
 - deepseek-r1:7b 
 - qwen2.5:14b    
 - gemma2:9b      
 - gemma:7b       
 - llama3.1:8b    
 - llama3.2:3b

El lenguaje mas liviano que encontré es mistral:latest

puedes ejecutar un promp directamente en la consola del contendor:

`ollama run nombreModelo "prompt"`

## Java
El codigo está con javadoc explicado pero lo mas importante para enganchar java y el contenedor son:

### Dependencias:
```
<dependency>
	<groupId>org.springframework.ai</groupId>
	<artifactId>spring-ai-ollama-spring-boot-starter</artifactId>
	<version>${spring-ai.version}</version>
</dependency>
```

### application.properties
```
# URL base de tu instancia local de Ollama (el puerto por defecto)
spring.ai.ollama.base-url=http://localhost:11434 

# Modelo que usarás. Debe ser un modelo que ya hayas descargado en Ollama.
spring.ai.ollama.chat.options.model=mistral:latest
```



