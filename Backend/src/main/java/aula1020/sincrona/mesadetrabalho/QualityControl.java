package aula1020.sincrona.mesadetrabalho;

public abstract class QualityControl {

    private QualityControl next;

    QualityControl(QualityControl next){
        this.next = next;
    }

    abstract void handleProduct(Product p);

    public QualityControl getNext() {
        return next;
    }

    public void setNext(QualityControl next) {
        this.next = next;
    }
}
