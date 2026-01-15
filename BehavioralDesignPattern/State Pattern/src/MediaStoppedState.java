public class MediaStoppedState implements MediaState{

    @Override
    public void pressButton(MediaPlayer mediaPlayer) {
        mediaPlayer.play();
        mediaPlayer.setState(new MediaPlayingState());
    }
}
