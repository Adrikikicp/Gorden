package net.enriquitomc.data;

import net.enriquitomc.Technetice;
import org.apache.logging.log4j.*;

public class AutomaticLoader {
    public static final AutomaticLoader INSTANCE = new AutomaticLoader();
    public static final Logger LOGGER = LogManager.getLogger();

    public static void load(){
        LOGGER.info("Load Technetice");
        new Technetice().load();
    }

}
