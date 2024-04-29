package net.tywrapstudios.undustrialized.api.units;

public interface CalculableQuantity<U extends Unit, Q extends CalculableQuantity<U, Q>> extends Quantity<U> {


    Q withValue(double value);



    default Q add(double value) {
        double newValue = getValue() + value;
        return withValue(newValue);
    }


    default Q substract(double value) {
        double newValue = getValue() - value;
        return withValue(newValue);
    }

    default Q substractFromValue(double value) {
        double newValue = value - this.getValue();
        return withValue(newValue);
    }

    default Q multiply(double value) {
        double newValue = getValue() * value;
        return withValue(newValue);
    }

    default Q divide(double value) {
        if (value == 0) {
            throw new ArithmeticException("Division by zero is not allowed. Please provide a non-zero divider value.");
        }
        double newValue = getValue() / value;
        return withValue(newValue);
    }

    default Q add(Quantity<U> inputQuantity) {
        if (inputQuantity == null) {
            return withValue(getValue());
        }
        U sourceUnit = this.getUnitType();
        Quantity<U> inputInSourceUnits = inputQuantity.toUnit(sourceUnit);
        double newValue = this.getValue() + inputInSourceUnits.getValue();
        return withValue(newValue);
    }

    default Q substract(Quantity<U> inputQuantity) {
        if (inputQuantity == null) {
            return withValue(getValue());
        }
        U sourceUnit = this.getUnitType();
        Quantity<U> inputInSourceUnits = inputQuantity.toUnit(sourceUnit);
        double newValue = this.getValue() - inputInSourceUnits.getValue();
        return withValue(newValue);
    }


    default <V extends Unit, T extends Quantity<V>> double multiply(T inputQuantity) {
        if (inputQuantity == null) {
            return getValue();
        }
        return this.getValue() * inputQuantity.getValue();
    }


    default <V extends Unit, T extends Quantity<V>> double divide(T inputQuantity) {
        if (inputQuantity == null) {
            return getValue();
        }
        double thisValue = getValue();
        if (inputQuantity.getValue() == 0) {
            throw new ArithmeticException("Divider quantity value cannot be zero.");
        }
        return thisValue / inputQuantity.getValue();
    }


}