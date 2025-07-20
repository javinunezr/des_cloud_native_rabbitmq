package ms_rabbitmq.grupo6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ms_rabbitmq.grupo6.service.RabbitListenerControlService;

@RestController
@RequestMapping("/rabbit-listener")
public class RabbitListenerAdminController {

	private final RabbitListenerControlService service;

	public RabbitListenerAdminController(RabbitListenerControlService service) {

		this.service = service;
	}

	@PostMapping("/pausar/{id}")
	public String pausar(@PathVariable String id) {

		service.pausarListener(id);
		return "Listener pausado: " + id;
	}

	@PostMapping("/reanudar/{id}")
	public String reanudar(@PathVariable String id) {

		service.reanudarListener(id);
		return "Listener reanudado: " + id;
	}

	@GetMapping("/status/{id}")
	public String status(@PathVariable String id) {

		return "Listener " + id + " está " + (service.isListenerRunning(id) ? "activo" : "pausado");
	}
}

