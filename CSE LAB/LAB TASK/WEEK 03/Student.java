public class Student {
    public String name;
    public String program;
    public Student(String name, String program) {
        this.name = name;
        this.program = program;
    }
    public void updateName(String name) {
        this.name = name;
    }
    public void updateProgram(String program) {
        this.program = program;
    }
    public String accessProgram() {
        return program;
    }
}
