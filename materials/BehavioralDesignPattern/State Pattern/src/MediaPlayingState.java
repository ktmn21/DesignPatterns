public class MediaPlayingState implements MediaState{

    @Override
    public void pressButton(MediaPlayer mediaPlayer) {
        mediaPlayer.pause();
        mediaPlayer.setState(new MediaStoppedState());
    }
}
