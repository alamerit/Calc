package java_core;

import java.math.BigInteger;

class CalcModel {

    private static final String INITIAL_VALUE = "0";


    private BigInteger m_total;


    CalcModel() {
        reset();
    }


    void reset() {
        m_total = new BigInteger(INITIAL_VALUE);
    }


    void multiplyBy(String operand) {
        m_total = m_total.multiply(new BigInteger(operand));
    }

    String getValue() {
        return m_total.toString();
    }

    void setValue(String value) {
        m_total = new BigInteger(value);
    }
}