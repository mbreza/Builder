package mbreza.classic;

public interface RpgSessionBuilder {
    void addGameMaster();
    void addNumberOfPlayers();
    void addSessionDate();
    void addSessionLocation();
    RpgSession getRpgSession();
}
