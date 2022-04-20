public class PetlaForEach {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        for( int i = 0; i < 10; i+=2){
            tablica[i]=i+1;

        }
        for (int zmienna:tablica){
            System.out.println(zmienna);
        }
    }
}
