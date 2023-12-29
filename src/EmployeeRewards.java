public class EmployeeRewards {
    private String empId;
    EmployeeRewards(String empId)
    {
        this.empId = empId;
    }

    public String getEmployeeId()
    {
        return empId;
    }

    public int getRewardPoints(double... fixedDeposits) {
        int rewardPoints = 0;
        double sum = 0;

        for (double deposits : fixedDeposits) {
            sum += deposits;
        }

        if (sum > 1000000) {
            rewardPoints = 2000;
        } else if (sum < 1000000 && sum >= 500000) {
            rewardPoints = 1000;
        } else {
            rewardPoints = 0;
        }

        return rewardPoints;
    }
}
