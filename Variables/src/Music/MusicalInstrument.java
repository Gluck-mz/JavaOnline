package Music;

import java.util.ArrayList;

public class MusicalInstrument {
    public String sound;
    public String size;
    public String color;
}

public class Guitar extends MusicalInstrument{

}

public class Trumpet extends MusicalInstrument{

}

public class Piano extends MusicalInstrument{

}

Public class MusicShop{
    ArrayList<MusicalInstrument> musicshop = new ArrayList<MusicalInstrument>();
    public void add(MusicalInstrument musicalInstrument){
        musicshop.add(musicalInstrument);
    }
}