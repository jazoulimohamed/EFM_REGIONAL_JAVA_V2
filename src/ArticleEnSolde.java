public class ArticleEnSolde extends Article {
    // attributes
    private double remise;

    // constructor
    public ArticleEnSolde(int code, double prixOrigine, double remise) throws Exception {
        super(code, prixOrigine);
        if (remise < 0 || remise > 90) {
            throw new Exception("Remise doit être comprise dans l'intervalle [0, 90].");
        }
        this.remise = remise;
    }

    // getters and setters
    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) throws Exception {
        if (remise < 0 || remise > 90) {
            throw new Exception("Remise doit être comprise dans l'intervalle [0, 90].");
        }
        this.remise = remise;
    }

    // methods
    @Override
    public double prixArticle() {
        return super.prixArticle() * (1 - remise / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ";" + remise;
    }
}