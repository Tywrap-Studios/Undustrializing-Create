package net.tywrapstudios.undustrialized.api.units.mass;

import net.tywrapstudios.undustrialized.api.units.Unit;
import org.jetbrains.annotations.VisibleForTesting;

import java.util.function.DoubleUnaryOperator;


public enum MassUnits implements MassUnit {
//    NON-SI UNITS
    UNIFIED_ATOMIC_MASS("u", val -> val * (1.6603145 * Math.pow(1.6603145, -12)), val -> val / (1.6603145 * Math.pow(1.6603145, -12))),

//    SI UNITS
    PICOGRAM("pg", val -> val * Math.pow(10, -12), val -> val / Math.pow(10, -12)),
    NANOGRAM("ng", val -> val * Math.pow(10, -9), val -> val / Math.pow(10, -9)),
    MICROGRAM("mcg", val -> val * Math.pow(10, -6), val -> val / Math.pow(10, -6)),
    MILLIGRAM("mg", val -> val * Math.pow(10, -3), val -> val / Math.pow(10, -3)),
    GRAM("g", val -> val, val -> val),
    KILOGRAM("kg", val -> val * Math.pow(10, 3), val -> val / Math.pow(10, 3)),
    TONNE("t", val -> val * Math.pow(10, 6), val -> val / Math.pow(10, 6));



//    MILLIGRAM("mg", val -> val * 0.000001, val -> val / 0.000001),
//    GRAM("g", val -> val * 0.001, val -> val / 0.001),
//    KILOGRAM("kg", val -> val, val -> val),
//    TON("t", val -> val * 1000.0, val -> val / 1000.0);

    private final String symbol;
    final DoubleUnaryOperator toBaseConverter;
    private final DoubleUnaryOperator fromBaseToUnitConverter;

    MassUnits(String symbol, DoubleUnaryOperator toBaseConverter, DoubleUnaryOperator fromBaseToUnitConverter) {
        this.symbol = symbol;
        this.toBaseConverter = toBaseConverter;
        this.fromBaseToUnitConverter = fromBaseToUnitConverter;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public MassUnit getBaseUnit() {
        return KILOGRAM;
    }

    @Override
    public double toValueInBaseUnit(double valueInThisUnit) {
        return toBaseConverter.applyAsDouble(valueInThisUnit);
    }

    @Override
    public double fromValueInBaseUnit(double valueInBaseUnit) {
        return fromBaseToUnitConverter.applyAsDouble(valueInBaseUnit);
    }

    public static MassUnit fromSymbol(String rawSymbol) {
        if (rawSymbol == null || rawSymbol.isBlank()) {
            return getDefaultUnit();
        }
        String requestedSymbol = unifySymbol(rawSymbol);
        for (MassUnit unit : values()) {
            String currentSymbol = unifySymbol(unit.getSymbol());
            if (currentSymbol.equalsIgnoreCase(requestedSymbol)) {
                return unit;
            }
        }
        throw new ArithmeticException("Unsupported unit symbol: " + "{" + rawSymbol + "}." + " Target class: "
                + MassUnits.class.getSimpleName());
    }
    @VisibleForTesting
    static String unifySymbol(String inputString) {
        return inputString
                .toLowerCase()
                .replace(" ", "")
                .replace("_", "");
    }

    public static MassUnit getDefaultUnit() {
        return KILOGRAM;
    }


}
