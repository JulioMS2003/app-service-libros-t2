package pe.edu.cibertec.app_service_libros_t2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_service_libros_t2.remoteservice.ServiceEventosClient;
import pe.edu.cibertec.app_service_libros_t2.remoteservice.ServiceMerchandisingClient;

@RequiredArgsConstructor
@RestController
public class GestionLibrosController {


    private final ServiceMerchandisingClient serviceMerchandisingClient;
    private final ServiceEventosClient serviceEventosClient;

    @GetMapping("/libros")
    public String obtenerLibros(){
        return "Lista de libros de Wigetta";
    }

    @GetMapping("/libros-precio")
    public String obtenerPrecio(){
        return "Precio de libros de Wigetta";
    }

    @GetMapping("/libros-merchandising")
    public String obtenerLibrosMerchandisign(){
        return serviceMerchandisingClient.obtenerMerchandising();
    }

    @GetMapping("/libros-eventos")
    public String obtenerLibrosEventos(){
        return serviceEventosClient.obtenerEventos();
    }

}
