package com.yamishdoy.data;
import org.apache.logging.log4j.*;
import net.enriquitomc.data.*;
import com.yamishdoy.*;
import com.yamishdoy.gorden.*;
public class YamishDataFile {
    private Marker MARKER = MarkerManager.getMarker("GordenFactory");
    private Logger LOGGER = LogManager.getLogger();

    public int whereGoes(){

        LOGGER.info(MARKER,"Loaded data where goes");
        return DataPack.load(10);

    }

}
