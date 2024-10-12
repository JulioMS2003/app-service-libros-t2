package pe.edu.cibertec.app_service_libros_t2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppServiceLibrosT2Application {

	public static void main(String[] args) {
		SpringApplication.run(AppServiceLibrosT2Application.class, args);
	}

}
