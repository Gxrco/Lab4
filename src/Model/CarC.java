package Model;

import java.util.ArrayList;
import java.util.Random;

public class CarC implements ICarC{
    private boolean isOnOff;
    private boolean radioStatus;
    private int volume;
    private float station;
    private int CallStatus;
    private boolean isConnected;
    private int AudioRep;
    private int ActualIndex;
    private ArrayList<Float> Stations= new ArrayList<Float>();
    private ArrayList<ISong> CD= new ArrayList<>();
    private ArrayList<ISong> Spotify= new ArrayList<>();
    private ArrayList<ISong> Mp3= new ArrayList<>();
    private ArrayList<String> Contacts= new ArrayList<>();
    private Random num= new Random();

    /**
     * @return El estado de la radio cambiado
     */
    @Override
    public boolean SwitchRadioONOFF() {
        if (isOnOff){
            isOnOff=false;
        }else {
            isOnOff=true;
        }
        return isOnOff;
    }

    /**
     * Obtener el estatus de la radio encendido/apagado
     *
     * @return status of the radio
     */
    @Override
    public boolean getRadioStatus() {
        return radioStatus;
    }

    /**
     * El volumen que sube o disminuye de 1 en 1
     *
     * @return Obtener el valor actual del volumen
     */
    @Override
    public int getVolume() {
        return volume;
    }

    /**
     * El volumen que sube o disminuye de 1 en 1
     *
     * @param Volume El volumen actual
     */
    @Override
    public void setVolume(int Volume) {
        this.volume=Volume;
    }

    /**
     * Metodo para cambiar el tipo de frecuencia de FM a AM
     *
     * @param frequency Si este es verdadero significa que es FM,
     *                  si es falso es AM
     * @return el valor cambiado de la frecuencia
     */
    @Override
    public boolean SwitchFrequency(boolean frequency) {
        boolean F;
        if (frequency=true){
            F=false;
        }else {
            F=true;
        }
        return F;
    }

    /**
     * Cambiar la estacion actual de la radio (Solo debe de cambiarse de 0.5 en 0.5)
     *
     * @param _station Regresa el volumen actual
     */
    @Override
    public void setStation(float _station) {
        this.station=_station;
    }

    /**
     * Obtener el valor actual de la radio
     *
     * @return el valor actual de la radio
     */
    @Override
    public float getStation() {
        return station;
    }

    /**
     * Metodo que debe guardar la estacion recibida en en el ArrayList
     *
     * @param _station
     */
    @Override
    public void SaveStation(float _station) {
        if (Stations.size()> 0){
            for (Float station: Stations){
                try {
                    if (station!= _station){
                        Stations.add(_station);
                    }
                }catch (Exception e){
                    System.out.println("This station is already saved " + e.getMessage());
                }
            }
        }
    }

    /**
     * Metodo para poner una estacion especifica, guardada en la lista, por medio
     * de el indice de su posicion en la lista
     *
     * @param _StationIndex Indice o posicion que se desea obtener
     * @return La emisora que se encontraba en el indice solicitado
     */
    @Override
    public float SelectSpecificStation(int _StationIndex) {
        float newstation = 0;
        try {
            if (Stations.get(_StationIndex) != station){
                newstation = (Stations.get(_StationIndex));
            }
        }catch (Exception e){
            System.out.println("This station is already playing " + e.getMessage());
        }
        return newstation;
    }

    /**
     * Este metodo se encarga de regresar el valor del tipo de reproduccion
     * 1(Reproduccion de CD) 2(Reproduccion de MP3) 3 (Reproduccion de Spotify)
     *
     * @return Numero que representa el tipo de reproductor
     */
    @Override
    public int getAudioRepType() {
        return AudioRep;
    }

    /**
     * Este metodo se encarga de cambiar el valor del tipo de reproduccion
     * 1(Reproduccion de CD) 2(Reproduccion de MP3) 3 (Reproduccion de Spotify)
     *
     * @return Numero que representa el tipo de reproductor
     */
    @Override
    public void setAudioRepType(int _AudioRep) {
        this.AudioRep=_AudioRep;
    }

    /**
     * Metodo que se encarga de obtener una de las listas de canciones pre definidas
     * Hay 3 tipos de listas (Lista 1 , lista de canciones en CD), (Lista 2, lista de canciones
     * en spotify), (Lista 3, lista de canciones MP3)
     *
     * @param TypeOfAudioReproduction Tipo de lista que se desea
     * @return Lista de canciones en funcion del tipo de que se solicita
     */
    @Override
    public ArrayList<ISong> getAListOfSongs(int TypeOfAudioReproduction) {
        ArrayList<ISong> songs= new ArrayList<>();
        switch (TypeOfAudioReproduction){
            case 1:
                for (ISong song: CD){
                    System.out.println("Name: " + song.getTitle() + "\nArtist: " + song.getArtist() + "\nDuration: " + song.getDuration());
                    songs.add(song);
                }
                break;
            case 2:
                for (ISong song: Spotify){
                    System.out.println("Name: " + song.getTitle() + "\nArtist: " + song.getArtist() + "\nDuration: " + song.getDuration());
                    songs.add(song);
                }
                break;
            case 3:
                for (ISong song: Mp3){
                    System.out.println("Name: " + song.getTitle() + "\nArtist: " + song.getArtist() + "\nDuration: " + song.getDuration());
                    songs.add(song);
                }
                break;
        }
        return songs;
    }

    /**
     * Metodo que se encarga de cambiar el indice actual de la lista de reproduccion.
     * Para ir a la siguiente cancion. Se obtiene el tipo de reproduccion para saber a
     * cual de las 3 listas se ledebe cambiar el indice actual
     *
     * @param CurrentIndex
     * @param TypeOfAudioReproduction
     */
    @Override
    public int NextSong(int CurrentIndex, int TypeOfAudioReproduction) {
        int new_index = 0;
        switch (TypeOfAudioReproduction) {
            case 1:
                if (CD.size() == 0) {
                    System.out.println("No tienes ninguna cancion agregada");
                } else {
                    new_index = CurrentIndex + 1;
                    if (new_index == CD.size()) {
                        new_index = 0;
                    }
                }
                break;
            case 2:
                if (Spotify.size() == 0) {
                    System.out.println("No tienes ninguna cancion agregada");
                } else {
                    new_index = CurrentIndex + 1;
                    if (new_index == Spotify.size()) {
                        new_index = 0;
                    }
                }
                break;
            case 3:
                if (Mp3.size() == 0) {
                    System.out.println("No tienes ninguna cancion agregada");
                } else {
                    new_index = CurrentIndex + 1;
                    if (new_index == Mp3.size()) {
                        new_index = 0;
                    }
                }
                break;
        }
        return new_index;
    }

    /**
     * Metodo que se encarga de cambiar el indice actual de la lista de reproduccion.
     * Para ir a la cancion anterior. Se obtiene el tipo de reproduccion para saber a cual de las 3 listas
     * se le debe cambiar el indice actual
     *
     * @param CurrentIndex
     * @param TypeOfAudioReproduction
     */
    @Override
    public int PrevSong(int CurrentIndex, int TypeOfAudioReproduction) {
        int new_index = 0;
        switch (TypeOfAudioReproduction) {
            case 1:
                if (CD.size() == 0) {
                    System.out.println("No tienes ninguna cancion agregada");
                } else {
                    new_index = CurrentIndex - 1;
                    if (new_index == -1) {
                        new_index = CD.size()-1;
                    }
                }
                break;
            case 2:
                if (Spotify.size() == 0) {
                    System.out.println("No tienes ninguna cancion agregada");
                } else {
                    new_index = CurrentIndex - 1;
                    if (new_index == -1) {
                        new_index = Spotify.size()-1;
                    }
                }
                break;
            case 3:
                if (Mp3.size() == 0) {
                    System.out.println("No tienes ninguna cancion agregada");
                } else {
                    new_index = CurrentIndex - 1;
                    if (new_index == -1) {
                        new_index = Mp3.size()-1;
                    }
                }
                break;
        }
        return new_index;
    }

    /**
     * Este metodo se encarga de regresar una cadena de texto que muestra las caracteristicas
     * de la cancion que se encuentra en el indice actual. EL indice actual se guarda como una variable dentro
     * del objecto carro, y unicamente es necesario solicitar el tipo de lista que se esta reproduciendo
     *
     * @param TypeOfAudioReproduction
     * @return Cadena de texto de la lista que se solicita, en la posicion actual
     */
    @Override
    public String PlaySong(int TypeOfAudioReproduction) {
        String theSong="";
        switch (TypeOfAudioReproduction){
            case 1:
                if (CD.size()==0){
                    System.out.println("You are not playing a song");
                } else {
                    theSong= "Name: " + CD.get(getActualIndex()).getTitle() + "\nArtist: " + CD.get(getActualIndex()).getArtist() + "\nAlbum: " + CD.get(getActualIndex()).getAlbum()
                    + "\nDuration: " + CD.get(getActualIndex()).getDuration() + "\nGenre: " + CD.get(getActualIndex()).getGenre() + "\nId: " + CD.get(getActualIndex()).getID();
                }
            case 2:
                if (Spotify.size()==0){
                    System.out.println("You are not playing a song");
                } else {
                    theSong= "Name: " + Spotify.get(getActualIndex()).getTitle() + "\nArtist: " + Spotify.get(getActualIndex()).getArtist() + "\nAlbum: " + Spotify.get(getActualIndex()).getAlbum()
                            + "\nDuration: " + Spotify.get(getActualIndex()).getDuration() + "\nGenre: " + Spotify.get(getActualIndex()).getGenre() + "\nId: " + Spotify.get(getActualIndex()).getID();
                }
            case 3:
                if (Mp3.size()==0){
                    System.out.println("You are not playing a song");
                } else {
                    theSong= "Name: " + Mp3.get(getActualIndex()).getTitle() + "\nArtist: " + Mp3.get(getActualIndex()).getArtist() + "\nAlbum: " + Mp3.get(getActualIndex()).getAlbum()
                            + "\nDuration: " + Mp3.get(getActualIndex()).getDuration() + "\nGenre: " + Mp3.get(getActualIndex()).getGenre() + "\nId: " + Mp3.get(getActualIndex()).getID();
                }
        }
        return theSong;
    }

    /**
     * Metodo que cambia el estado de telefono conectado (verdadero o falso)
     *
     * @return el valor cambiado de la conexion con el telefono
     */
    @Override
    public boolean Connect_DisconnectPhone() {
        if (getPhoneConnectionStatus()){
            this.isConnected=false;
        }else {
            this.isConnected=true;
        }
        return isConnected;
    }

    /**
     * Metodo para obtener el estatus de conexion del telefono
     * si esta conectado o no
     *
     * @return estado de conexion de telefono
     */
    @Override
    public boolean getPhoneConnectionStatus() {
        return isConnected;
    }

    /**
     * Obteniendo la lista de contactos, Contiene el nombre de las personas.
     * No debe de haber nombres iguales en la lista y los nombres pueden estar definidos dentro
     * del programa
     *
     * @return
     */
    @Override
    public ArrayList<String> getListofContacts() {
        for (String contact: Contacts){
            System.out.println(contact);
        }
        return null;
    }

    /**
     * Obtener el valor de llamada, si el telefono esta en llamada, en espera
     * o si no esta en llamada. A cada opcion le corresponde un numero
     *
     * @return estatus de llamada
     */
    @Override
    public int getCallStatus() {
        return CallStatus;
    }

    /**
     * cambia el estado de la llamada al cual se esta teniendo
     * @param _Status
     */
    @Override
    public void setCallStatus(int _Status){
        this.CallStatus=_Status;
    }

    /**
     * Metodo para hacer una llamada, este metodo
     * verifica si la llamada es posible, y si lo es, regresar
     * un mensaje que contenga el nombre de la persona que se esta llamando
     *
     * @param NameforCall
     * @return Mensaje de llamando
     */
    @Override
    public String makeCall(String NameforCall) {
        String message;
        if (getCallStatus()==1 || getCallStatus()==2){
            message= "You are on a call";
        }else {
            setCallStatus(1);
            message= "Calling " + NameforCall;
        }
        return message;
    }

    /**
     * Metodo para cambiar el estatus de llamada a en espera
     *
     * @return mensaje de persona puesta en espera
     */
    @Override
    public String PlaceCallOnHold() {
        String message;
        if (getCallStatus()==1){
            setCallStatus(2);
            message="Waiting...";
        }else {
            message= "You are not in a call";
        }
        return message;
    }

    /**
     * Terminar la llamada y cambiar status
     *
     * @return mensaje de fin de llamada
     */
    @Override
    public String endCall() {
        String message;
        if (getCallStatus()==1 || getCallStatus()==2){
            setCallStatus(3);
            message="Finished";
        }else {
            message= "You are not in a call";
        }
        return message;
    }

    /**
     * Obtener el pronostico de tiempo. Queda a disposicion como obtener el clima
     * o si se deja un clima definido dentro del codigo.
     *
     * @return Texto que indica el clima actual (real o simulado)
     */
    @Override
    public String getWeatherForCast() {
        int weather= num.nextInt(3);
        String Weather = "";
        switch (weather){
            case 0:
                Weather= "18° C \nCloudy \nHumidity: 80%\nWind: 14 km/h";
            case 1:
                Weather= "32° C \nSunny \nHumidity: 90%\nWind: 05 km/h";
            case 2:
                Weather= "18° C \nRain \nHumidity: 70%\nWind: 20 km/h";
        }
        return Weather;
    }

    /**
     *Agregar canciones a una lista, la cancion debe estar creada
     * @param list tipo de lista a la que se desea guardar
     * @param song cancion que se guardara
     */
    @Override
    public void addSongToAList(int list, ISong song){
        switch (list){
            case 1:
                for (ISong song1: CD){
                    if (song==song1){
                        System.out.println("You already have add this song");
                    }else {
                        CD.add(song);
                        break;
                    }
                }
                break;
            case 2:
                for (ISong song1: Spotify){
                    if (song==song1){
                        System.out.println("You already have add this song");
                    }else {
                        Spotify.add(song);
                        break;
                    }
                }
                break;
            case 3:
                for (ISong song1: Mp3){
                    if (song==song1){
                        System.out.println("You already have add this song");
                    }else {
                        Mp3.add(song);
                        break;
                    }
                }
                break;
        }
    }

    /**
     * Trae al index actual
     * @return ActualIndex
     */
    @Override
    public int getActualIndex() {
        return ActualIndex;
    }

    /**
     * establece el index actual
     * @param actualIndex
     */
    @Override
    public void setActualIndex(int actualIndex) {
        ActualIndex = actualIndex;
    }
}
