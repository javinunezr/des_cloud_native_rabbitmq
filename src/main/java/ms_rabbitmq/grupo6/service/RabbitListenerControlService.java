package ms_rabbitmq.grupo6.service;


public interface RabbitListenerControlService {

	void pausarListener(String id);

	void reanudarListener(String id);

	boolean isListenerRunning(String id);
}


