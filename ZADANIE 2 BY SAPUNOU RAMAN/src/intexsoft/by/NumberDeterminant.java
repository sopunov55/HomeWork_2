package intexsoft.by;

public class NumberDeterminant
{
    int numberDefine;
    public void numberDeterminant()
    {
        if(numberDefine % 10==7)
        {
            System.out.println("Последняя цифра числа является семеркой");
        }
        else
        {
            System.out.println("Последняя цифра числа не является семеркой");
        }
    }
}
