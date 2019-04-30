package mbreza;

import mbreza.caseForBuilder.PcSetBuilder;
import mbreza.caseForFactory.ErgonomicFactory;
import mbreza.caseForFactory.NormalFactory;
import mbreza.caseForFactory.Worksite;
import mbreza.classic.*;
import mbreza.fluent.RpgSessionFluent;

public class App {
    public static void main( String[] args ) {

        Worksite nw = new Worksite(NormalFactory.createInstance());
        Worksite ew = new Worksite(ErgonomicFactory.createInstance());

        System.out.println(nw.getChair().getType());
        System.out.println(ew.getChair().getType());

        RpgSessionFluent rsf = new RpgSessionFluent.Builder()
                .addGameType(GameType.CALLOFCTHULHU)
                .addGameMaster("Kowalski")
                .addNumberOfPlayers(4)
                .addSessionLocation("Kowalski's basement")
                .build();

        PcSetBuilder psb = new PcSetBuilder.Builder()
                .addMonitor("m")
                .addBox("b")
                .addMotherboard("m")
                .addPsu("p")
                .addStorage("s")
                .addRam("r")
                .addGpu("g")
                .addCpu("c")
                .build();

        System.out.println(rsf.getSessionLocation());

        RpgSessionGenerator rsg = new RpgSessionGenerator();

        RpgSessionBuilder rsb = new DungeonsAandDragonsSessionBuilder();
        rsg.generateSession(rsb);
        RpgSession rs = rsb.getRpgSession();
        System.out.println(rs.getSessionLocation());
    }
}
