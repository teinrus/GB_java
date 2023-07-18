public class HashSet {
    private Integer[] el =new Integer[10];

    public void add(Integer elementI){
        for (int i = 0; i < el.length ;i++) {
            if (el[i]==null){
                el[i]=elementI;
                break;
            }

        }
    }
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < el.length; i++) {
            if (el[i] != null) {
                res.append(el[i]).append(",");
            }
            if (res.length()>0){
                res.setLength(res.length()-1);
            }

        }
        return "{"+res.toString()+"}";
    }

    public  Integer printOneEl(int index){
        if (index>=0 && index< el.length){
            return el[index];
        }

        return null;
    }

}
