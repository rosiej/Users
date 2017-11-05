package pl.sdacademy.java7krkr;

public class Developer extends User {
    private String programingLanguage;

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    @Override
    void printMyRole() {
        System.out.println("jestem developerem ");
    }
}
