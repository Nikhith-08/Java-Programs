class Employee {
    void printEmployee() {
        System.out.println("Employee level method");
    }

}

class Manager extends Employee {
    void printManager() {
        System.out.println("Manager level method");
    }

}

class GuestManager extends Manager {
    void printGuestManager() {
        System.out.println("GuestManager level method");
    }

}

class MultiLevelInherit {
    public static void main(String[] args) {
        GuestManager n=new GuestManager();
        n.printEmployee();
        n.printManager();
        n.printGuestManager();
    }

}