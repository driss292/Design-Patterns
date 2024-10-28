// Classe Chocolat qui hérite de decorateurIngredient et donc indirectement de dessert.
public class Chocolat extends DecoratorIngredient {

    // Constructeur qui prend en paramètre le dessert.
    public Chocolat(Dessert dessertAttr) {
        dessert = dessertAttr;
    }

    // On affiche le libellé du dessert et on rajoute le libellé de l'ingrédient
    // chocolat.
    public String getLibelle() {
        return dessert.getLibelle() + ", chocolat";
    }

    // On additionne le prix du dessert et le prix de l'ingrédient chocolat.
    public double getPrix() {
        return dessert.getPrix() + 0.80;
    }
}
