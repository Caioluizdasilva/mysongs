package mysongs.principal;

import mysongs.models.MyFavorites;
import mysongs.models.Music;
import mysongs.models.Podcast;

public class Principal {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Forever");
        myMusic.setSinger("Kiss");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("BolhaDev");
        myPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.include(myPodcast);
        favorites.include(myMusic);
    }
}
