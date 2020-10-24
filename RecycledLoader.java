class RecycledLoader extends Loader {

	public RecycledLoader(int identifier, Cruise cruise) {
		super(identifier, cruise);
	}


	@Override
        public String toString() {
		return "Recycled Loader " + getIdentifier() +  " serving " + getCruise();
	}
        
	@Override
	int getNextAvailableTime() {
		return (this.getCruise().getServiceCompletionTime() + 60);
	}
        
	@Override
	public boolean canServe(Cruise cruise) {
		return cruise.getArrivalTime() >= getCruise().getServiceCompletionTime() + 60;
	}
}
