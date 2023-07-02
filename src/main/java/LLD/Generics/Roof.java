package LLD.Generics;

public class Roof {
    int noofRoof;
    public Roof(int num)
    {
        this.noofRoof=num;
    }
    public boolean equals(Object o)
    {
        if(o instanceof Roof)
        {
            if(((Roof) o).noofRoof==this.noofRoof)
            {
                return true;
            }
        }
        return false;
    }
}
