package DesignPatterns.AnnualRetreat.Breakout;

public class GoalSetting extends BreakoutItem {
    @Override
    public int price() {
        return 299;
    }

    @Override
    public String name() {
        return "Goal Setting";
    }

    @Override
    public int sessions() {
        return 1;
    }

    @Override
    public String description () {
        return "S.M.A.R.T. Goal Setting";
    }
}