package BuilderPattern;

public class Student
{
    private int id;
    private int rollNumber;
    private  int age;
    private String name;
    private String school;
    private  int batchYear;

    public int getId() {
        return id;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getBatchYear() {
        return batchYear;
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    private Student(StudentBuilder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.id = builder.id;
        this.rollNumber = builder.rollNumber;
        this.school = builder.school;
        this.batchYear = builder.batchYear;
    }

    public static class StudentBuilder{
        private int id;
        private int rollNumber;
        private  int age;
        private String name;
        private String school;
        private  int batchYear;

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }
        public StudentBuilder setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setSchool(String school) {
            this.school = school;
            return this;
        }

        public StudentBuilder setBatchYear(int batchYear) {
            this.batchYear = batchYear;
            return this;
        }

        public Student build(){
            //validation
            return new Student(this);
        }
    }


}
