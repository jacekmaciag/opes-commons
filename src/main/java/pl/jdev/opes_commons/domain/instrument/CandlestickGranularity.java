package pl.jdev.opes_commons.domain.instrument;

import lombok.Getter;

import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

import static java.time.temporal.ChronoUnit.*;

@Getter
public enum CandlestickGranularity {

    /**
     * 5 second candlesticks, minute alignment
     */
    S5(5000, SECONDS),
    /**
     * 10 second candlesticks, minute alignment
     */
    S10(10000, SECONDS),
    /**
     * 15 second candlesticks, minute alignment
     */
    S15(15000, SECONDS),
    /**
     * 30 second candlesticks, minute alignment
     */
    S30(30000, SECONDS),
    /**
     * 1 minute candlesticks, minute alignment
     */
    M1(60000, MINUTES),
    /**
     * 2 minute candlesticks, hour alignment
     */
    M2(120000, MINUTES),
    /**
     * 4 minute candlesticks, hour alignment
     */
    M4(240000, MINUTES),
    /**
     * 5 minute candlesticks, hour alignment
     */
    M5(300000, MINUTES),
    /**
     * 10 minute candlesticks, hour alignment
     */
    M10(600000, MINUTES),
    /**
     * 15 minute candlesticks, hour alignment
     */
    M15(900000, MINUTES),
    /**
     * 30 minute candlesticks, hour alignment
     */
    M30(1800000, MINUTES),
    /**
     * 1 hour candlesticks, hour alignment
     */
    H1(3600000, HOURS),
    /**
     * 2 hour candlesticks, day alignment
     */
    H2(7200000, HOURS),
    /**
     * 3 hour candlesticks, day alignment
     */
    H3(10800000, HOURS),
    /**
     * 4 hour candlesticks, day alignment
     */
    H4(14400000, HOURS),
    /**
     * 6 hour candlesticks, day alignment
     */
    H6(21600000, HOURS),
    /**
     * 8 hour candlesticks, day alignment
     */
    H8(28800000, HOURS),
    /**
     * 12 hour candlesticks, day alignment
     */
    H12(43200000, HOURS),
    /**
     * 1 day candlesticks, day alignment
     */
    D(86400000, DAYS),
    /**
     * 1 week candlesticks, aligned to start of week
     */
    W(604800000, WEEKS),
    /**
     * 1 month candlesticks, aligned to first day of the month
     */
    M(0, MONTHS);

    private final int millis;
    private final ChronoUnit unit;

    CandlestickGranularity(int millis, ChronoUnit unit) {
        this.millis = millis;
        this.unit = unit;
    }

}
