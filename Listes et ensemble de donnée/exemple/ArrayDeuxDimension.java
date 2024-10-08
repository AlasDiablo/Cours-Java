class ArrayDeuxDimension {
    public static void main(String[] args) {
        // On crée un tableau à deux dimensions d'entier avec une taille de 10x10.
        // Dans le cas d'une liste d'entiers, chaque cellule est initialisée à 0.
        int[][] tableau = new int[10][10];

        // On assigne 10 à la cellule ayant pour index 0 dans la première dimension et 1 dans la deuxième.
        tableau[0][1] = 10;

        // On imprime la valeur de la cellule ayant pour index 0 dans la première dimension et 1 dans la deuxième.
        System.out.println(tableau[0][1]);
    }
}