package TheFlower;

import java.util.ArrayList;

public class Flower {
    public String name;
    public String size;
    public String color;
}

public class Rose extends Flower{

}

public class Chamomile extends Flower{

}

public class Aster extends Flower{

}

public class Tulip extends Flower{

}

public class Bouquet{
    ArrayList<Flower> bouquet = new ArrayList<Flower>();
    public void add(Flower flower){
        bouquet.add(flower);
    }
}

public class BushOfRoses{
    ArrayList<Rose> bushofroses = new ArrayList<Rose>();
    public void add(Rose rose){
        bushofroses.add(rose)
    }
}