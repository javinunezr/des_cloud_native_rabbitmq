package ms_rabbitmq.grupo6.service;

public interface ProducirMensajeService {

	void enviarMensaje(String mensaje);

	public void enviarObjeto(Object objeto);
}
