package management;

public class Director extends Manager{
    private  int budget;

    public Director(String name, String nINumber, int salary, String deptName, int budget) {
        super(name, nINumber, salary, deptName);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }
}
