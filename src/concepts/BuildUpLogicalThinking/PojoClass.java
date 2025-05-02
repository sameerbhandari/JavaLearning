package concepts.BuildUpLogicalThinking;

public class PojoClass {
    int a;
    int b;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        PojoClass pojo = new PojoClass();
        pojo.setA(5);

        System.out.println(pojo.getB());
    }


}
