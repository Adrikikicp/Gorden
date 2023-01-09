package com.yamishdoy.gorden;

import net.enriquitomc.Technetice;
import net.enriquitomc.data.AutomaticLoader;
import net.enriquitomc.data.DataPack;

import java.io.File;

public class Main extends File {
    public static void main(String[] args){
        AutomaticLoader.load();
    }
    public Main(String string){
        super(string);
        Technetice.datapack.toString();
        DataPack.load(12);
    }
}
