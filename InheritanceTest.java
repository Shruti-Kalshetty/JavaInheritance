class College {

    String name;

    public void project() {
        System.out.println("I can make");
    }
}

class Student extends College  {

    public void display() {
        System.out.println("My name is " + name);
    }
}

class Main {
    public static void main(String[] args) {

        Student st = new Student();

        st.name = "Shru";
        st.display();

        st.project();

    }
}