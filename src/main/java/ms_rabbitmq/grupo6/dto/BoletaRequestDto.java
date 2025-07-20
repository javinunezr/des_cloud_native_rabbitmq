package ms_rabbitmq.grupo6.dto;

import java.util.List;

import ms_rabbitmq.grupo6.entity.Producto;

public class BoletaRequestDto {
    private Long clienteId;
    private List<Producto> productos;

    // Getters y setters
    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
