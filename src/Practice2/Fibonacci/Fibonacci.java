package Practice2.Fibonacci;

public class Fibonacci
{
    public long getNumber(int position){
        if (position <= 0) {
            return -1;
        }
        if (position == 1 || position == 2) {
            return 1;
        }
        return getNumber(position-1) + getNumber(position-2);
    }
}