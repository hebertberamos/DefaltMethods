package entities;

public class Loan {

	private Double valor;
	private Integer meses;
	
	private InterestService InterestService;
	
	public Loan() {
	}

	public Loan(Double valor, Integer meses, InterestService interestService) {
		super();
		this.valor = valor;
		this.meses = meses;
		InterestService = interestService;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getMeses() {
		return meses;
	}

	public void setMeses(Integer meses) {
		this.meses = meses;
	}
	
	public void setInterestService(BrazilInterestService interestService) {
		InterestService = interestService;
	}

	@Override
	public String toString() {
		return String.format("%.2f", InterestService.payment(valor, meses)) ;
	}
}
