void serveCruises(Cruise[] cruises) {
        Loader[] loaderArray = new Loader[270];
        for (int i = 0; i < cruises.length; i++) {
                int noOfLoaders = cruises[i].getNumOfLoadersRequired();
                for (int j = 0; j < noOfLoaders; j++) {
                        for (int k = 0; k < loaderArray.length; k++) {
                                if (loaderArray[k] == null){
                                        loaderArray[k] = new Loader(k+1, cruises[i]);
                                        System.out.println(loaderArray[k]);
                                        break;
                                } else if (loaderArray[k].canServe(cruises[i])) {
                                        loaderArray[k] = loaderArray[k].serve(cruises[i]);
                                        System.out.println(loaderArray[k]);
                                        break;

                                }
                        }
                }
        }
}
