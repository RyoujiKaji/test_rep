package lb1;

public class Number {

    private int _valueSeven; // значение в 7 сс
    private int _valueThr; //значение в 3 сс

    private final static int MID = 10, SEVEN = 7, THREE = 3; //основания сс, в которые осуществляется перевод

    Number(int value) {
        _valueSeven = value;
        _valueThr = -1;
    }

    Number() {
        _valueSeven = 0;
        _valueThr = -1;
    }
    
    /*
    переводит число из 7 сс в 3 сс
    возвращает результат перевода (число в 3сс)
    */
    public int convert() {
        if (_valueThr == -1) convertToThr(convertToDec());
        return this._valueThr;
    }

    
    /*
    переводит число из 7 сс в 10 сс
    возврашает результат перевода (число в 10сс)
    */
    private int convertToDec() {
        int ans = 0, count = 1, curr = _valueSeven;
        while (curr > 0) {
            ans += (curr % 10) * (count);
            count *= SEVEN;
            curr /= MID;
        }
        return ans;
    }
    
    /*
    переводит число из 10сс в 3сс
    возвращает результат перевода (число в 3сс)
    */
    private void convertToThr(int n) {
        String s = "";
        while (n > 0) {
            s = String.valueOf(n % THREE) + s;
            n /= THREE;
        }
        this._valueThr = Integer.parseInt(s);
    }
}