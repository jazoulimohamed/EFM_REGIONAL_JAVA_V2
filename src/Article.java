public class Article {
    // attributes
    private int code;
    private double prixOrigine;

    // constructor
    public Article(int code, double prixOrigine) {
        this.code = code;
        this.prixOrigine = prixOrigine;
    }

    // getters and setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrixOrigine() {
        return prixOrigine;
    }

    public void setPrixOrigine(double prixOrigine) {
        this.prixOrigine = prixOrigine;
    }

    // methods
    public double prixArticle() {
        return prixOrigine;
    }

    @Override
    public String toString() {
        return code + ";" + prixOrigine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Article) {
            Article other = (Article) obj;
            return this.code == other.code;
        }
        return false;
    }
}