public abstract class Student implements Comparable<Student>{

    protected String name;
    protected String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void tuitionFees(){
        System.out.println(this);
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
