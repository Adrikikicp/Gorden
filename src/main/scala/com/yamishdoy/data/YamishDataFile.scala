package com.yamishdoy.data

import net.enriquitomc.*
import java.io.File
import java.net.*
import net.enriquitomc.data.*
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.MarkerManager
import net.enriquitomc.data.AutomaticLoader
class YamishDataFile(dataPack: DataPack,uri:URI,fileIn:File){


  private val MARKER = MarkerManager.getMarker("GordenFactory")
  private val LOGGER = LogManager.getLogger

  def whereGoes(): Int ={

    LOGGER.info(MARKER,"Loaded data where goes");
    return DataPack.load(10) + new Technetice().create();

  }

}