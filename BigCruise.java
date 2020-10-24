public class BigCruise extends Cruise {
	private final double cruiseLen;
	private final int numPassengers;

	public BigCruise(String identifier, int arrivalTime, double cruiseLen, int numPassengers) {
		super(identifier,arrivalTime,0,0);
		this.cruiseLen = cruiseLen;
		this.numPassengers = numPassengers;
	}

	@Override
	int getNumOfLoadersRequired() {
		return (int) Math.ceil(this.cruiseLen / 40);
	}

        @Override
	int getServiceCompletionTime() {
		return (int) Math.ceil((double) this.numPassengers/50) + this.getArrivalTime();
	}
}
