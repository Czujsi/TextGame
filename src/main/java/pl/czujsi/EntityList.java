package pl.czujsi;

import java.util.ArrayList;
import java.util.List;

public class EntityList {
    DarkElf darkElf = new DarkElf();
    WhiteElf whiteElf = new WhiteElf();

    List<DarkElf> darkElfList = new ArrayList<>();
    List<WhiteElf> whiteElfList = new ArrayList<>();

    public void addDarkElf(DarkElf darkElf){
        darkElfList.add(darkElf);
    }

    public void addWhiteElf(WhiteElf whiteElf){
        whiteElfList.add(whiteElf);
    }


}
