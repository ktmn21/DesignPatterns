
public class MediaPlayer {
    private  MediaState state;

    public MediaPlayer() {
        this.state = new MediaStoppedState();
    }

    public void pressButton(){
        state.pressButton(this);
    }

    public void play() {
        System.out.println("Playing");
        System.out.println("Displaying pause icon");
    }

    public void pause() {
        System.out.println("Paused");
        System.out.println("Displaying play icon");
    }

    public void setState(MediaState mediaState){
        this.state = mediaState;
    }

}
