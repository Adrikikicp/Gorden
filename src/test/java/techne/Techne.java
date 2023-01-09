package techne;
import com.yamishdoy.YamishDoy;
import com.yamishdoy.data.YamishDataFile;
import net.enriquitomc.Technetice;
import net.enriquitomc.data.DataPack;
import org.apache.log4j.LogManager;
import java.io.*;
import java.net.*;
public class Techne {
    public void load(){
        LogManager.getLogger("ModelLoader").info("Loaded Technetice from YamishDoy");
        new YamishDoy().finalize();
        new Technetice().create();
        new YamishDataFile(new DataPack(),new URI(""), new File("data.cfg")).whereGoes();
    }

}
