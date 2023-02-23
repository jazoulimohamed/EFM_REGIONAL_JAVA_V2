import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Magasin {
    private List<Article> articles;

    public Magasin() {
        articles = new ArrayList<Article>();
    }

    public int indiceDe(int code) {
        for (int i = 0; i < articles.size(); i++) {
            Article article = articles.get(i);
            if (article.getCode() == code) {
                return i;
            }
        }

        return -1;
    }

    public void ajouter(Article a) throws Exception {
        if (articles.contains(a)) {
            throw new Exception("L'article existe déjà dans le magasin");
        }

        articles.add(a);
    }

    public boolean supprimer(int code) {
        int index = indiceDe(code);
        if (index != -1) {
            articles.remove(index);
            return true;
        }

        return false;
    }

    public boolean supprimer(Article a) {
        return articles.remove(a);
    }

    public int nombreArticlesEnSolde() {
        int count = 0;
        for (Article article : articles) {
            if (article instanceof ArticleEnSolde) {
                count++;
            }
        }

        return count;
    }

    public void enregistrer(String chemin) throws IOException {
        FileWriter writer = new FileWriter(chemin);
        for (Article article : articles) {
            writer.write(article.toString() + "\n");
        }
        writer.close();
    }
}