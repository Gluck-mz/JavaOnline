package Music;

import java.util.ArrayList;

public class MusicalInstrument {
    public String sound;
    public String size;
}

public class Guitar extends MusicalInstrument{
    public String type;
}

public class Trumpet extends MusicalInstrument{
    public String material;
}

public class Piano extends MusicalInstrument{
    public String color;
}

Public class MusicShop{
    ArrayList<MusicalInstrument> musicshop = new ArrayList<MusicalInstrument>();
    public void add(MusicalInstrument musicalInstrument){
        musicshop.add(musicalInstrument);
    }
}