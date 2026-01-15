public abstract class MediaState {

    public abstract void pressButton(MediaPlayer mediaPlayer);

    public void play() {
        System.out.println("Playing");
        System.out.println("Displaying pause icon");
    }

    public void pause() {
        System.out.println("Paused");
        System.out.println("Displaying play icon");
    }


}
