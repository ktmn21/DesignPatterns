public class MediaStoppedState extends MediaState{


    @Override
    public void pressButton(MediaPlayer mediaPlayer) {
        super.play();
        mediaPlayer.setState(new MediaPlayingState());
    }
}
