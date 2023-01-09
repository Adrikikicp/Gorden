package com.yamishdoy.data;

public class YamishDataFile {
    private Marker MARKER = MarkerManager.getMarker("GordenFactory");
    private Logger LOGGER = LogManager.getLogger();

    public int whereGoes(){

        LOGGER.info(MARKER,"Loaded data where goes");
        return DataPack.load(10);

    }

}
