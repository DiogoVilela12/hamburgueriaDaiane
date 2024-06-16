package hambugueriaDaiane;

import java.util.UUID;

public class NotaFiscal {
	private double PrecoTotal;
	private Pedido pedido;
	private User usuario;
	private UUID IdNotaFiscal;
	
	public NotaFiscal( Pedido pedido, User usuario) {
		super();
		this.pedido = pedido;
		this.usuario = usuario;
	}
	
	public double getPrecoTotal() {
		return PrecoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		PrecoTotal = precoTotal;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public User getUsuario() {
		return usuario;
	}
	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
	public UUID getIdNotaFiscal() {
		return IdNotaFiscal;
	}
	public void setIdNotaFiscal() {
		IdNotaFiscal = UUID.randomUUID();
	}

	
}
