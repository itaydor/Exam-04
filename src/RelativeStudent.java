public class RelativeStudent extends Student{

    private static int numberOfCreations = 0;

    private int degree;

    public RelativeStudent(String name, String id, int degree) {
        super(name, id);
        this.degree = degree;
        numberOfCreations++;
    }

    @Override
    public String toString() {
        int price = 0;
        switch (degree){
            case 1 -> price = 7500;
            case 2 -> price = 5000;
            case 3 -> price = 1000;
        }
        return name + " (Relative " + degree + " ): " + price + " shekel";
    }

    public static int getNumberOfCreations(){
        return numberOfCreations;
    }
}
