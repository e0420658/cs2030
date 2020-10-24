class Loader { 
	private final int identifier;
	private final Cruise cruise;

	public Loader(int identifier, Cruise cruise) {
		this.identifier = identifier;
		this.cruise = cruise;
	}

	public boolean canServe(Cruise cruise) {
		return cruise.getArrivalTime() >= this.cruise.getServiceCompletionTime();
	}

	public Loader serve(Cruise cruise) {
		if (this.canServe(cruise)){
			return new Loader(this.identifier, cruise);
		} else {
			return this;
		}	
	}

	int getIdentifier(){
		return this.identifier;
	}

	int getNextAvailableTime() {
		return this.cruise.getServiceCompletionTime();
	}

	Cruise getCruise() {
		return this.cruise;
	}
	
	@Override
	public String toString() {
		return "Loader " + this.identifier +  " serving " + this.cruise;
	}


}
