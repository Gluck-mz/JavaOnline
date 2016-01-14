public class Length {
    public static void main(String[] args){
        double l;

        DotA dotA = new DotA(1, 1);
        DotB dotB = new DotB(4, 4);

        l = Math.sqrt((dotB.getX2() - dotA.getX1()) * (dotB.getX2() - dotA.getX1()) + (dotB.getY2() - dotA.getY1()) * (dotB.getY2() - dotA.getY1()));
        System.out.println("The length between A and B is equal to " + l);

    }

}
