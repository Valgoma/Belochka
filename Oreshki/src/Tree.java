public class Tree {
    public Nuts[] makeNutsArray(int amount) {
        Nuts[] nutsArray = new Nuts[amount];
        for (int i=0; i < amount; i++)
        {
            nutsArray[i] = new Nuts();
        }
        return nutsArray;
    }
}
