package _3_Behavioral_Pattern.Exam7.work_1_StrategyPattern;

// 具体策略类
public class ConcreteFind3 extends FindStrategy {

    @Override
    public String find(String word) {
        System.out.println(word + ": 方法3");
        return null;
    }
}