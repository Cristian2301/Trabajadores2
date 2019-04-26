package trabajadores;

public class Ingreso {
	private Integer percepcion;
	private String concepto;
	private Double montoPercibido;
	private Integer horasExtrasRealizadas;
	private Double valorPorHora;
	
	public Integer getPercepcion() {
		return percepcion;
	}

	
	public void setPercepcion(Integer percepcion) {
		this.percepcion = percepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Double getMontoPercibido() {
		return montoPercibido;
	}

	public void setMontoPercibido( Double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}

	

	public Ingreso(Integer percepcion, String concepto, Double montoPercibido, Integer horasExtrasRealizadas, Double valorPorHora) {
		this.percepcion = percepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
		this.horasExtrasRealizadas = horasExtrasRealizadas;
		this.valorPorHora = valorPorHora;
	}
	
	
	public Double totalPercibido() {
		return this.montoPercibido + this.montoPorHorasExtras() - this.getImpuestoAPagar();
	}
	

	private Double montoPorHorasExtras() {
		return this.valorPorHora * this.horasExtrasRealizadas;
	}

	private Double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.2;
	}

	public Double getMontoImponible() {
		return this.getMontoPercibido();
	}
	
}
