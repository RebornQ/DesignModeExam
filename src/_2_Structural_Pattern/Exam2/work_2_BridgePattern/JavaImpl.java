package _2_Structural_Pattern.Exam2.work_2_BridgePattern;

public class JavaImpl implements ProgrammingLanguageImpl {

    @Override
    public void printProgrammingLanguage() {
        System.out.println("编程语言为Java");
    }
}
