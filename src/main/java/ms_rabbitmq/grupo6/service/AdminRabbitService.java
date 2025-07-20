package ms_rabbitmq.grupo6.service;

import ms_rabbitmq.grupo6.dto.BindingDTO;

public interface AdminRabbitService {

	public void crearCola(String nombreCola);

	public void crearExchange(String nombreExchange);

	public void crearBinding(BindingDTO request);

	public void eliminarCola(String nombreCola);

	public void eliminarExchange(String nombreExchange);
}

