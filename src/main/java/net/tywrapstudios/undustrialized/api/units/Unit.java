package net.tywrapstudios.undustrialized.api.units;

public interface Unit {
    String getSymbol();

    Unit getBaseUnit();

//    Convert from this unit to X value in Base unit
    double toValueInBaseUnit(double valueInThisUnit);

//    Convert from X (X is value in Base Unit) to this unit
    double fromValueInBaseUnit(double valueInBaseUnit);
}
