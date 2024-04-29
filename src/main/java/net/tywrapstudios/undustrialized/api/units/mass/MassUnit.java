package net.tywrapstudios.undustrialized.api.units.mass;

import net.tywrapstudios.undustrialized.api.units.Unit;

public interface MassUnit extends Unit {
    @Override
    MassUnit getBaseUnit();
}