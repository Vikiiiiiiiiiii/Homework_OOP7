package controller;

import model.ComplexNumber;

public class NumCreator {
    ComplexNumber createComplexNumber (int index, int material, int imaginary){
        return new ComplexNumber(index, material, imaginary);
    }
}