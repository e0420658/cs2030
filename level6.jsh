void serveCruises(Cruise[] cruises) {
	Loader[] loaderArray = new Loader[270];
	for (int i= 0; i < cruises.length; i++) {
		int noOfLoaders = cruises[i].getNumOfLoadersRequired();
		for (int j = 0; j < noOfLoaders; j++) {
			for ( int k = 0; k < loaderArray.length; k++) {
				if (loaderArray[k] == null) {
					if ((k+1)%3 == 0) {
						loaderArray[k] = new RecycledLoader(k+1, cruises[i]);
						System.out.println(loaderArray[k]);
						break;
					} else {
						loaderArray[k] = new Loader(k+1, cruises[i]); 
						System.out.println(loaderArray[k]);
						break;
					}
				} else if (loaderArray[k].canServe(cruises[i])) {
					if (loaderArray[k] instanceof RecycledLoader) {
						loaderArray[k] = new RecycledLoader(k+1, cruises[i]);  
					        System.out.println(loaderArray[k].serve(cruises[i]));  
                                                break;
					} else {
						loaderArray[k] = new Loader(k+1, cruises[i]);
						System.out.println(loaderArray[k].serve(cruises[i]));
						break;
					}
				}
			}
		}
	}
}
