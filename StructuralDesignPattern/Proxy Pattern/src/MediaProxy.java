public class MediaProxy implements MediaPlayer{

    private MediaPlayer mediaPlayer;

    @Override
    public void playMedia() {
        if(mediaPlayer == null){
            mediaPlayer = new MovieMediaPlayer();
        }
        mediaPlayer.playMedia();
    }
}
