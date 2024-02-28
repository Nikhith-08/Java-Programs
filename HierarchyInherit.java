class Teacher {
    void displayTeacher() {
        System.out.println("Teacher class statement");
    }
}

class Student1 extends Teacher {
    void displayStudent1() {
        System.out.println("Student1 class statement");
    }
}

class Student2 extends Teacher {
    void displayStudent2() {
        System.out.println("Student2 class statement");
    }
}

class HierarchyInherit {
    public static void main(String[] args) {
        Student1 obj1 = new Student1();
        obj1.displayTeacher();
        obj1.displayStudent1();
        Student2 obj2 = new Student2();
        obj2.displayTeacher();
        obj2.displayStudent2();

    }
}
