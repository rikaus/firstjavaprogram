public class ChocolateTester
{
    public static void main(String[] args) {
        Chocolate c = new Chocolate();
        c.display(c.getBarCode(), c.getName(),c.getWeight(),c.getCost());
        c.setBarCode(102);
        c.setName("Hershey's");
        c.setWeight(24);
        c.setCost(50);
        c.display(c.getBarCode(), c.getName(),c.getWeight(),c.getCost());
    }

}
