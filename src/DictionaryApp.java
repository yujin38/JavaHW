abstract class PairMap {
    protected String keyArray [];
    protected  String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class Dictionary extends PairMap{
    static int number = 0;
    Dictionary(int n) {
        keyArray = new String[n];
        valueArray = new String[n];
    }
    String get(String key) {
        for(int i = 0; i<number; i++){
            if(key.equals(keyArray[i]))
                return valueArray[i];
        }
        return null;
    }
    void put(String key, String value) {
        boolean flag = true;
        for(int i = 0; i<number; i++) {
            if (key.equals(keyArray[i])) {
                valueArray[i] = value;
                flag = false;
                break;
            }
        }
        if(flag) {
            keyArray[number] = key;
            valueArray[number] = value;
            number++;
        }
    }
    String delete(String key) {
        for(int i = 0; i<number; i++){
            if(key.equals(keyArray[i])){
                keyArray[i] = null;
                valueArray[i] = null;
                return valueArray[i];
            }
        }
        return null;
    }
    int length() {
        return number;
    }
}

class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
