package model;

public interface Summable <T extends Number> extends Calculatable {
    T sum (T arg2);
}