class Student {
    
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        setCgpa(cgpa); 
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        if(cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 4.0. Setting to 0.0 by default.");
            this.cgpa = 0.0;
        }
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", CGPA: " + cgpa);
    }

    public static void main(String[] args) {
     
        Student s1 = new Student(101, "Afif", 3.8);
        s1.display();

        Student s2 = new Student(102, "Zaman", 4.5);
        s2.display();

        s2.setCgpa(3.5);
        s2.display();
    }
}

