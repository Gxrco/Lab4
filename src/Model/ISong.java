package Model;

/**
 * Interface para la clase cancion, estas se usaran en  distintos tipos de array
 * @author andre
 *
 */
public interface ISong {
    public void setTitle(String _title);

    public String getTitle();

    public void setArtist(String _artist);

    public String getArtist();

    public void setAlbum(String _album);

    public String getAlbum();

    public void setDuration(String _duration);

    public String getDuration();

    public void setGenre(String _genre);

    public String getID();
}
