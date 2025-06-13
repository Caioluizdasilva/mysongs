package mysongs.models;

public class MyFavorites {

    public void include(Audio audio) {
        if (audio.getRating() >= 9) {
            System.out.println(audio.getTitle() + " is considered a huge success and everyone's favorite!");
        } else {
            System.out.println(audio.getTitle() + " is also one of the popular ones people are enjoying.");
        }
    }
}
