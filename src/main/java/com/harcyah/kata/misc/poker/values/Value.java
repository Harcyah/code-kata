package com.harcyah.kata.misc.poker.values;

public enum Value {

    _2,
    _3,
    _4,
    _5,
    _6,
    _7,
    _8,
    _9,
    _T,
    _J,
    _Q,
    _K,
    _A;

    @Override
    public String toString() {
        return this.name().substring(1, 2);
    }

    public static Value parse(String letter) throws IllegalValueException {
        try {
            return Value.valueOf("_" + letter);
        } catch (Exception e) {
            throw new IllegalValueException("Letter " + letter + " is not valid value");
        }
    }

}
