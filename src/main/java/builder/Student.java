package builder;

/**
 * The Builder is used to create different immutable objects step by step
 * using the same building process
 */
public class Student {

    private String name;
    private int age;
    private String level;
    private String address;
    private String email;

    private Student(StudentBuilder studentBuilder){
        name = studentBuilder.name;
        age = studentBuilder.age;
        level = studentBuilder.level;
        address = studentBuilder.address;
        email = studentBuilder.email;
    }

    public static class StudentBuilder{
        private String name;
        private int age;
        private String level;
        private String address;
        private String email;

        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder age(int age){
            this.age = age;
            return this;
        }

        public StudentBuilder level(String level){
            this.level = level;
            return this;
        }

        public StudentBuilder address(String address){
            this.address = address;
            return this;
        }

        public StudentBuilder email(String email){
            this.email = email;
            return this;
        }

        public Student build(){
            if (name == null) {
                throw new IllegalStateException("The value of 'name' can't be null");
            }
            if (age == 0) {
                throw new IllegalStateException("The value of 'age' can't be zero");
            }
            if (level == null) {
                throw new IllegalStateException("The value of 'level' can't be null");
            }
            if (address == null) {
                throw new IllegalStateException("The value of 'address' can't be null");
            }
            if (email == null) {
                throw new IllegalStateException("The value of 'email' can't be null");
            }
            return new Student(this);
        }
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getLevel() {
        return level;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
