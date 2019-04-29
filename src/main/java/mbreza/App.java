package mbreza;

import mbreza.classic.*;
import mbreza.fluent.RpgSessionFluent;

public class App {
    public static void main( String[] args ) {
        RpgSessionFluent rsf = new RpgSessionFluent.Builder()
                .addGameType(GameType.CALLOFCTHULHU)
                .addGameMaster("Kowalski")
                .addNumberOfPlayers(4)
                .addSessionLocation("Kowalski's basement")
                .build();


        System.out.println(rsf.getSessionLocation());

        RpgSessionGenerator rsg = new RpgSessionGenerator();

        RpgSessionBuilder rsb = new DungeonsAandDragonsSessionBuilder();
        rsg.generateSession(rsb);
        RpgSession rs = rsb.getRpgSession();
        System.out.println(rs.getSessionLocation());
    }
}
