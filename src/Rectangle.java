public class Rectangle
{
    private int length;
    private int breadth;

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void calculatePerimeter()
    {
        System.out.format("Perimeter of Rectangle is : %d",2*(length+breadth));
    }

}
