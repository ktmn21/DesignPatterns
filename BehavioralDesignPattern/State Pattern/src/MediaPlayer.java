
public class MediaPlayer {
    private  MediaState state;

    public MediaPlayer() {
        this.state = new MediaStoppedState();
    }

    public void pressButton(){
        state.pressButton(this);
    }

    public void setState(MediaState mediaState){
        this.state = mediaState;
    }

}
