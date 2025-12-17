package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoinDecisionTest {

    private CoinDecision coinDecision;

    @BeforeEach
    void setUp() {
        coinDecision = new CoinDecision();
    }

    // R1 – Zero H values
    @Test
    void R1_ZeroH() {
        String result = coinDecision.CoinDecision("T", "T", "T", "T");
        assertEquals("Negative", result);
    }

    // R2 – One H value
    @Test
    void R2_OneH() {
        String result = coinDecision.CoinDecision("H", "T", "T", "T");
        assertEquals("Negative", result);
    }

    // R3 – Two H values
    @Test
    void R3_TwoH() {
        String result = coinDecision.CoinDecision("H", "H", "T", "T");
        assertEquals("Positive", result);
    }

    // R4 – Three H values
    @Test
    void R4_ThreeH() {
        String result = coinDecision.CoinDecision("H", "H", "H", "T");
        assertEquals("Positive", result);
    }

    // R5 – Four H values
    @Test
    void R5_FourH() {
        String result = coinDecision.CoinDecision("H", "H", "H", "H");
        assertEquals("Positive", result);
    }
}
