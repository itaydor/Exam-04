public class CommonStudent extends Student{

    private static int numberOfCreations = 0;

    private int scholarship;

    public CommonStudent(String name, String id ,int scholarship) {
        super(name, id);
        this.scholarship = scholarship;
        numberOfCreations++;
    }

    @Override
    public String toString() {
        int discount = scholarship * 100;
        return name + " (" + (100 - scholarship) + "%): " + (10000 - discount) + " shekel";
    }

    public static int getNumberOfCreations(){
        return numberOfCreations;
    }
}
