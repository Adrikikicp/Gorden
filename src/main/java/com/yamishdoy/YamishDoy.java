package com.yamishdoy;

import com.yamishdoy.data.YamishDataFile;
import net.enriquitomc.data.DataPack;
import net.enriquitomc.Technetice;
import org.apache.log4j.LogManager;


public class YamishDoy extends YamishDataFile {
    public int finaliza(){
        DataPack.dataVersion = 10;
        DataPack.load(10);
new Technetice().load();
return DataPack.dataVersion  + DataPack.load(20);
    }

    @Override
    public int whereGoes() {
        return super.whereGoes() + finaliza();
    }
}
