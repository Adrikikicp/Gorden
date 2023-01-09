package net.enriquitomc;

import net.enriquitomc.data.DataPack;
import net.enriquitomc.data.ITechnicClass;

import java.util.Iterator;

public class Technetice implements ITechnicClass {
    @Override
    public void load() {
this.create();
    }

    @Override
    public int create() {
        return  DataPack.load(10);
    }


}
