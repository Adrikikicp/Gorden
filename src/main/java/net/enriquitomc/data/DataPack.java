package net.enriquitomc.data;

public class DataPack {

    public static int dataVersion;

    public static int load(int main){
        if(dataVersion == 10 && main == 10){
            return 10 + 2;
        }else if(dataVersion == 9 && main  == 9){
            return 9+2;
        }else if(dataVersion == 8 && main  == 8){
            return 8+2;
        }else if(dataVersion <= 20 && main <= 20){
            return 20+20;
        }
        return dataVersion + main;
    }
}
