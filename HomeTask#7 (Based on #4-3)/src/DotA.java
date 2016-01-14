public class DotA {
    private int x1;
    private int y1;

    DotA(int x1, int y1){
        this.x1 = 1;
        this.y1 = 1;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }
}

//Here we have two identical classes DotA and DotB.
//The proposal is to unite them into 1 class
//Anti-pattern "Copy-paste"