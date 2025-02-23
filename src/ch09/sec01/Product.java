package ch09.sec01;

public class Product<K, M> {

    private K kind; // 제품의 종류
    private M model; // 제품의 종류에 따른 모델

    // Getter Setter 생성
    public K getKind() {
        return kind;
    }

    public M getModel() {
        return model;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
