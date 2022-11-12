package Model;

public interface ICarA {
    /**
     * Metodo para obtener si la llamada esta en altavos o en modo auricular
     * true = esta en speaker
     * @return
     */
    public boolean getSpeakerStatus();

    /**
     * Metodo para cambiar el estado de llamada entre speaker y auriculares
     * la variable se cambia en el metodo y en el objeto
     * @param LastCalledContact
     */
    public boolean ChangeSpeakerStatus();

    /**
     * Metodo para regresar la planificacion de un viaje
     * @param tripday dia del viaje
     * @param tripHour_ hora de comeinzo del viaje
     * @param tripPlace A donde sera el viaje
     * @param tripLength Cuanto durara el viaje completo
     * @param tripObjective descripcion y motivo del viaje
     * @return Cadena modificada que describa la planificacion del viaje
     */
    public String TripPlanification(String tripday, String tripHour_, String tripPlace, String tripLength, String tripObjective);
}
