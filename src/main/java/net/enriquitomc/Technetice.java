package net.enriquitomc;

import net.enriquitomc.data.DataPack;
import net.enriquitomc.data.ITechnicClass;
import org.apache.logging.log4j.*;

import java.util.Iterator;

public class Technetice implements ITechnicClass {
    @Override
    public void load() {
this.create();
    }

    @Override
    public int create() {
        Logger logger = LogManager.getLogger();
        logger.info("Load");
        return  DataPack.load(10);
    }


}
