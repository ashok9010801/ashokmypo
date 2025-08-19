public class simple {
    int id;
    String name;
    int age;
    String branch;
    Long year;

    void setDetails(int id, String name, int age, String branch, long year) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.year = year;
    }

    void getDetails()
    {
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("branch:" + branch);
        System.out.println("year:" + year);
    }
    public static void main(String[] args){
        simple obj1 = new simple();
        simple obj2 = new simple();
        obj1.setDetails(1,"prakash",20, "AIDS",2025);
        obj2.setDetails(1,"abhi",20, "AIDS",2025);
        obj1.getDetails();
        obj2.getDetails();
    }
}

