package net.tywrapstudios.undustrialized.api.units;

import java.util.Objects;

//Thank god unitutility exists

public interface Quantity<U extends Unit> extends Comparable<Quantity<U>> {
    double getValue();

//    Get the quantity in the base unit
    double getBaseValue();

    U getUnitType();

    Quantity<U> toBaseUnit();

    Quantity<U> toUnit(U targetUnit);

    default String getUnitSymbol() {
        return getUnitType().getSymbol();
    }

    default double getInUnit(U targetUnit) {
        return targetUnit.fromValueInBaseUnit(getBaseValue());
    }

    default boolean isGreaterThan(Quantity<U> quantity) {
        if (Objects.isNull(quantity)) {
            return false;
        }
        return this.toBaseUnit().getValue() > quantity.toBaseUnit().getValue();
    }

    default boolean isEqualOrGreaterThan(Quantity<U> quantity) {
        if (Objects.isNull(quantity)) {
            return false;
        }
        return this.toBaseUnit().getValue() >= quantity.toBaseUnit().getValue();
    }

    default boolean isLowerThan(Quantity<U> quantity) {
        if (Objects.isNull(quantity)) {
            return false;
        }
        return this.toBaseUnit().getValue() < quantity.toBaseUnit().getValue();
    }

    default boolean isEqualOrLowerThan(Quantity<U> quantity) {
        if (Objects.isNull(quantity)) {
            return false;
        }
        return this.toBaseUnit().getValue() <= quantity.toBaseUnit().getValue();
    }
//     * Check if the physical quantity is equal to another quantity within a specified epsilon.
//     * Both quantities are converted to their respective base units for valid comparison.
    default boolean isEqualWithPrecision(Quantity<U> quantity, double epsilon) {
        if (this == quantity) {
            return true;
        }
        if (quantity == null || getClass() != quantity.getClass()) {
            return false;
        }
        Quantity<U> thisInBaseUnit = this.toBaseUnit();
        Quantity<U> inputInBaseUnit = quantity.toBaseUnit();
        if (thisInBaseUnit.getUnitType() != inputInBaseUnit.getUnitType()) {
            return false;
        }
        double thisValue = thisInBaseUnit.getValue();
        double inputValue = inputInBaseUnit.getValue();
        return Math.abs(thisValue - inputValue) < epsilon;
    }



    default boolean isPositive() {
        return getValue() > 0;
    }

    default boolean isPositiveOrZero() {
        return getValue() >= 0;
    }

    default boolean isNegative() {
        return getValue() < 0;
    }

    default boolean isNegativeOrZero() {
        return getValue() <= 0;
    }

    default boolean isEqualZero() {
        return getValue() == 0;
    }


    default String toEngineeringFormat() {
        if (getUnitSymbol().isBlank()) {
            return String.valueOf(getValue());
        }
        return String.format("%s [%s]", getValue(), getUnitSymbol());
    }


    @Override
    default int compareTo(Quantity<U> other) {
        if (this == other) {
            return 0;
        }
        // Convert both quantities to the same unit for comparison
        Quantity<U> thisInOtherUnit = this.toUnit(other.getUnitType());

        // Compare the values of the two quantities
        double thisValue = thisInOtherUnit.getValue();
        double otherValue = other.getValue();

        return Double.compare(thisValue, otherValue);
    }


}
