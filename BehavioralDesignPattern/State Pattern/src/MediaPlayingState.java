public class MediaPlayingState extends MediaState{


    @Override
    public void pressButton(MediaPlayer mediaPlayer) {
        super.pause();
        mediaPlayer.setState(new MediaStoppedState());
    }
}
