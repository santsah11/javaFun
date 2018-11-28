class Person {
    private int age;
    private String name;

    public Person(int ageParam, String nameParam) {
        this.age = ageParam;
        this.name = nameParam;
    }

    public void objectMethods(Person person) {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("toString: " + this.toString());
        System.out.println("Equals: " + this.equals(person));
        System.out.println("Name of person object " + person.name);
    }
}
