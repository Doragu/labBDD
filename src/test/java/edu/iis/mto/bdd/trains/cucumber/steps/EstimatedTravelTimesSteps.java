package edu.iis.mto.bdd.trains.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;
import org.joda.time.LocalTime;

public class EstimatedTravelTimesSteps {

    @Zakładając("^chcę się dostać z (.*) do (.*)$")
    public void chcę_się_dostać_z_Parramatta_do_TownHall(String lineStart, String lineEnd) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Zakładając("^następny pociąg odjeżdża o (.*) na linii (.*)$")
    public void następny_pociąg_odjeżdża_o_na_linii_Western(@Transform(JodaLocalTimeConverter.class) LocalTime startTime, String line) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Gdy("^zapytam o godzinę przyjazdu$")
    public void zapytam_o_godzinę_przyjazdu() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu: (.*)$")
    public void powinienem_uzyskać_następujący_szacowany_czas_przyjazdu(@Transform(JodaLocalTimeConverter.class) LocalTime endTime) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
