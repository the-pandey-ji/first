package first;

import java.util.ArrayList;

public class CollatzConjecture
{
    private int number;

    public CollatzConjecture(int number){
        this.number=number;
    }
    public ArrayList<Integer> getCollatzString(){
    ArrayList<Integer> list = new ArrayList<>();
    if(number == 1)
    return list;
    else
        while(number != 1){
            if(number % 2 == 0)
            {
                number /= 2;
                list.add(number);
            }
            else {
                number = number * 3 + 1;
                list.add(number);
            }
        }
        return list;
}
}
