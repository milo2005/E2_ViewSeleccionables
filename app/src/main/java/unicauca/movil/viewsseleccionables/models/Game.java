package unicauca.movil.viewsseleccionables.models;

/**
 * Created by Dario Chamorro on 9/09/2015.
 */
public class Game {

    String name, genere,imgUrl;
    float score;

    public Game() {
    }

    public Game(String name, String genere, String imgUrl, float score) {
        this.name = name;
        this.genere = genere;
        this.imgUrl = imgUrl;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
