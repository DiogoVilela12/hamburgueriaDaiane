package hambugueriaDaiane;

import java.util.List;
import java.util.UUID;

public class Pedido {
	private UUID IdPedido;
	private List<Sanduiche> ListaPedidos;
	
	public Pedido() {
		setIdPedido(UUID.randomUUID());
	}

	public List<Sanduiche> getListaPedidos() {
		return ListaPedidos;
	}

	public void addPedido(Sanduiche pedido) {
		this.ListaPedidos.add(pedido);
	}

	public UUID getIdPedido() {
		return IdPedido;
	}

	public void setIdPedido(UUID idPedido) {
		IdPedido = idPedido;
	}
}
