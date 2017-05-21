package exceptions;

public class RateException extends Exception {

	public String rateDomainModel;
	
	public RateException(String rateDomainModel) {
		super(rateDomainModel);
	}
	public RateException(){
		super();
	}

	public String getRateDomainModel() {
		return rateDomainModel;
	}

}
