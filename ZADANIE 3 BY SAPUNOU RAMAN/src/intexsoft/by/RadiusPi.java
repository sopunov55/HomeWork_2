package intexsoft.by;

import sun.nio.cs.ext.MacThai;

public class RadiusPi
{
    double aWidgh, bLenght, radiusCicrle;


    public void radiusDefine()
    {
        if (radiusCicrle * radiusCicrle >= (aWidgh * aWidgh + bLenght * bLenght) /4)
        {
            System.out.println("Прямоугольное отверстие закрыть можно кругом радиусом " + radiusCicrle);
        }
            else
        {
            System.out.println("Прямоугольное отверстие закрыть нельзя кругом радиусом " + radiusCicrle );
        }
    }
}
