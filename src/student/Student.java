package student;

public class Student {
    private String name;
    private float avgMark;
    private int age;
    private String group;

    public void setName(String name) {
        this.name = name;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public Student() {


    }

    Student(String name, float avgMark, int age, String group) {
        this.name = name;
        this.avgMark = avgMark;
        this.age = age;
        this.group = group;

    }


    private boolean isValidInfor() {
        return (age >= 18) && (!(avgMark < 0) && !(avgMark > 10)) && (group.startsWith("A") || group.startsWith("C"));

    }

    public void showInfor() {

        if (isValidInfor()) {
            System.out.println("Name is: " + getName());
            System.out.println("Age is: " + getAge());
            System.out.println("Group is: " + getGroup());
            System.out.println("Average is: " + getAvgMark());
            if (isGetScholarship()) {
                System.out.println("Eligibility for scholarship");
            } else
                System.out.println("Not Eligibility for scholarship");
        } else {
            System.out.println("Information is invalid:");
        }

    }

    private boolean isGetScholarship() {
        return isValidInfor() && avgMark > 8;
    }

}
