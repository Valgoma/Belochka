public class Squirrel {

    public double collectNuts(Nuts[] nutsArray)
    {
        double sum = 0;
        for (int i=0; i<nutsArray.length; i++)
        {
            sum += Nuts.weight;
            System.out.println("Ура, еще орех" + sum);
        }
        System.out.println("Ура, я собрала " + sum + " граммов орехов");
        return sum;
    }
}

