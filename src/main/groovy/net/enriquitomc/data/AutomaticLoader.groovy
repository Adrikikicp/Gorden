package net.enriquitomc.data

import net.enriquitomc.Technetice
import org.apache.logging.log4j.LogManager

class AutomaticLoader {

    static final def INSTANCE = new AutomaticLoader()
    static final def LOGGER = LogManager.getLogger();

    static void load(){
LOGGER.info("Load Technetice")
        new Technetice().load();
    }

}
