public class Cruise{
	private final String identifier;
	private final int arrivalTime;
	private final int numOfLoader;
	private final int serviceTime;

	Cruise(String identifier, int arrivalTime, int numOfLoader, int serviceTime) {
		this.identifier = identifier;
		this.arrivalTime = arrivalTime;
		this.numOfLoader = numOfLoader;
		this.serviceTime = serviceTime;
	}

	int getServiceCompletionTime() {
		int serviceTimeMins = this.getArrivalTime()+ this.serviceTime;
		return serviceTimeMins;
	}


	int getArrivalTime() {
		int arrivalMins = (this.arrivalTime/100)*60 + this.arrivalTime%100;
		return arrivalMins;

	}
	
	int getNumOfLoadersRequired() {
		return this.numOfLoader;
	}

	@Override
	
	public String toString() {
		return this.identifier +"@" + String.format("%04d",this.arrivalTime);
	}
}


