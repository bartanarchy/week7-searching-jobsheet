public class Students {
    int nim, age;
    String name;
    double gpa;

    public Students(int nim, String name, int age, double gpa) {
        this.nim = nim;
        this.age = age;
        this.name = name;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("NIM: " + nim);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    public class SearchStudent {
        Students[] listStd = new Students[5];
        int idx;

        public void add(Students std) {
            if (idx < listStd.length) {
                listStd[idx] = std;
                idx++;
            } else {
                System.out.println("Data is already full");
            }
        }
        
    }
}