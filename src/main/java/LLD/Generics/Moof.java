package LLD.Generics;

public class Moof {
    int noOfmoof;
    public Moof(int num)
    {
        this.noOfmoof=num;
    }
    public Moof(){

    }
    public boolean equals(Object o)
    {
        if((o instanceof Moof)&&(((Moof) o).noOfmoof==this.noOfmoof))
        {
            return true;
        }
        return false;
    }

}
