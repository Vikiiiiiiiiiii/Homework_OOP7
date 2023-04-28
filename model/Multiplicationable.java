package model;

public interface Multiplicationable <T extends Number> extends Calculatable{
    T multiplication (T arg2);
}