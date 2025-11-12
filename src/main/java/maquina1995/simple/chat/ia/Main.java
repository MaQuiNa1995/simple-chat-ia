package maquina1995.simple.chat.ia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.ai.chat.ChatClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * Main con llamada desde consola a contenedor de docker con mistral como modelo de lenguaje
 * 
 * @author MaQuiNa1995
 *
 */
@Log4j2
@SpringBootApplication
@RequiredArgsConstructor
public class Main implements CommandLineRunner {

	/**
	 * Objeto propio de Spring boot encargado de la comunicacion con el modelo
	 */
	private final ChatClient chatClient;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

			System.out.print("Formula tu pregunta: ");
			String prompt = reader.readLine();
			System.out.println(chatClient.call(prompt));
			
		} catch (IOException e) {
			log.error(e.getMessage());
		}

		
	}
}