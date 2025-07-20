package ms_rabbitmq.grupo6.service;

import java.io.IOException;

import org.springframework.amqp.core.Message;

import com.rabbitmq.client.Channel;

public interface ConsumirMensajeService {

	void recibirMensaje(Object mensaje);

	void recibirMensajeConAckManual(Message mensaje, Channel canal) throws IOException;

	String obtenerUltimoMensaje();
}


