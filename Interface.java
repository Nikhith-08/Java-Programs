interface Bank {
    void rateOfInterest();
}

class SBI implements Bank {
    public void rateOfInterest() {
        System.out.println("SBI rate of interest is: 9.25");
    }
}

class AB implements Bank {
    public void rateOfInterest() {
        System.out.println("AB rate of interest is: 8.5");
    }

}

class Interface {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        b.rateOfInterest();
        b = new AB();
        b.rateOfInterest();
    }
}
