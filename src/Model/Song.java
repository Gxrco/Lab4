package Model;

/**
 * The type Song.
 */
public class Song implements ISong{

    /**
     * Instantiates a new Song.
     *
     * @param _title    the title
     * @param _artist   the artist
     * @param _album    the album
     * @param _duration the duration
     * @param _genre    the genre
     * @param _ID       the id
     */
    public Song(String _title, String _artist, String _album, String _duration, String _genre, String _ID){
        title = _title;
        artist = _artist;
        album = _album;
        duration = _duration;
        genre = _genre;
        ID = _ID;
    }

    private String title;
    private String artist;
    private String album;
    private String duration;
    private String genre;
    private String ID;


    @Override
    public void setTitle(String _title) {
        title = _title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setArtist(String _artist) {
        this.artist = _artist;
    }

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public void setAlbum(String _album) {
        album = _album;
    }

    @Override
    public String getAlbum() {
        return album;
    }

    @Override
    public void setDuration(String _duration) {
        duration = _duration;
    }

    @Override
    public String getDuration() {
        return duration;
    }

    @Override
    public void setGenre(String _genre) {
        genre = _genre;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public String getGenre() {
        return genre;
    }
}
